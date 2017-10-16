import Logger.Logger;
import framework.ui.home.HomeTopBarNavigator;
import framework.ui.login.LoginPage;
import org.testng.annotations.Test;

public class Third extends BaseTest {
    @Test
    public void flow3() {
        logger.info("Oleg test flow3 STARTED.");
        LoginPage loginPage = new LoginPage(threadDriver.get());
        loginPage.fillUserName("oleg.glizrin@datorama.com")
                .fillPassword("cm8a7vvp ")
                .clickSignIn()
                .fillEmail("oleg.glizrin@datorama.com")
                .fillPass("Volume99")
                .logIn();
        HomeTopBarNavigator homeTopBarNavigator = new HomeTopBarNavigator(threadDriver.get());
        homeTopBarNavigator.navigateConnectAndMix();
        logger.info("Oleg test flow3 FINISHED.");
    }
}
