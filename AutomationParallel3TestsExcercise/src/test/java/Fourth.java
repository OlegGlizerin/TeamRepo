import org.testng.annotations.Test;


public class Fourth extends BaseTest{



    @Test
    public void flow4() throws InterruptedException {
        report.log("test flow4 STARTED." + "Thread ID:" + Thread.currentThread().getId());
        getDriver().get("http://www.google.com");
        Thread.sleep(5000);
        report.log("test flow4 FINISHED." + "Thread ID:" + Thread.currentThread().getId());
    }





}
