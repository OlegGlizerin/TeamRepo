package Logger;

import com.sun.javafx.binding.Logging;
import org.openqa.selenium.WebDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Logger implements ILogger {

    private static ReentrantLock lockInstance = new ReentrantLock();
    private ReadWriteLock lockWrite = new ReentrantReadWriteLock();

    private final String LOGPATH = "parallelLog.txt";
    private static Logger logger = null;
    private BufferedWriter bw = null;




    private Logger() {

    }

    public static Logger getInstance() {
        lockInstance.lock();
        try {
            if(logger == null) {
                logger = new Logger();
            }
        }
        finally {
            lockInstance.unlock();
        }
        return logger;
    }

    @Override
    public void info(String data) {
        lockWrite.writeLock().lock();
        try {
            writeToLog(" [INFO] ", data);
        }
        finally {
            lockWrite.writeLock().unlock();
        }
    }

    @Override
    public void error(String data) {
        lockWrite.writeLock().lock();
        try {
            writeToLog(" [ERROR] ", data);
        }
        finally {
            lockWrite.writeLock().unlock();
        }
    }

    @Override
    public void debug(String data) {
        lockWrite.writeLock().lock();
        try {
            writeToLog(" [DEBUG] ", data);
        }
        finally {
            lockWrite.writeLock().unlock();
        }
    }

    @Override
    public void warning(String data) {
        lockWrite.writeLock().lock();
        try {
            writeToLog(" [WARNING] ", data);
        }
        finally {
            lockWrite.writeLock().unlock();
        }
    }

    @Override
    public void clear() {
        try {
            PrintWriter writer = new PrintWriter(LOGPATH);
            writer.print("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void writeToLog(String logType, String data) {
        Date date = new Date();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOGPATH,true))) {
            bw.write(date + logType + data);
            bw.write("\r\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
