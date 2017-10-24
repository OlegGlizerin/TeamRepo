import org.testng.annotations.Test;


public class Sixth extends BaseTest{



    @Test
    public void flow6() throws InterruptedException {
        threadLocalLogger.get().log("test flow6 STARTED." + "Thread ID:" + Thread.currentThread().getId());
        getDriver().get("http://www.google.com");
        Thread.sleep(5000);
        threadLocalLogger.get().log("test flow6 FINISHED." + "Thread ID:" + Thread.currentThread().getId());
    }





}
