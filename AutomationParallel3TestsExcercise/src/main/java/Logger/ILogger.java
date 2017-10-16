package Logger;

public interface ILogger {
    public void info(String text);
    public void error(String text);
    public void debug(String text);
    public void warning(String text);
    public void clear();

}
