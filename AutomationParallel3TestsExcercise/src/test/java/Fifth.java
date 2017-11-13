import org.testng.annotations.Test;


public class Fifth extends BaseTest{



    @Test
    public void flow5() throws InterruptedException {
        report.log("test flow5 STARTED." + "Thread ID:" + Thread.currentThread().getId());
        getDriver().get("http://www.google.com");
        Thread.sleep(5000);
        report.log("test flow5 FINISHED." + "Thread ID:" + Thread.currentThread().getId());
    }





}
