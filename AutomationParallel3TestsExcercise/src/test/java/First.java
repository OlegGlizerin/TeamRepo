
import framework.ui.login.LoginPage;
import org.testng.annotations.*;


public class First extends BaseTest{



    @Test
    public void flow1() throws InterruptedException {
        threadLocalLogger.get().log("test flow1 STARTED." + "Thread ID:" + Thread.currentThread().getId());
        getDriver().get("http://www.google.com");
        Thread.sleep(5000);
        threadLocalLogger.get().log("test flow1 FINISHED." + "Thread ID:" + Thread.currentThread().getId());
    }





}
