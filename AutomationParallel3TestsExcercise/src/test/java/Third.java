
import framework.ui.home.HomeTopBarNavigator;
import framework.ui.login.LoginPage;
import org.testng.annotations.Test;

public class Third extends BaseTest {

    @Test
    public void flow3() throws InterruptedException {

        report.log("test flow3 STARTED." + "Thread ID:" + Thread.currentThread().getId());
        getDriver().get("http://www.google.com");
        Thread.sleep(5000);
        report.log("test flow3 FINISHED." + "Thread ID:" + Thread.currentThread().getId());
    }
}
