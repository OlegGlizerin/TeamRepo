import Logger.Logger;
import framework.ui.home.HomeTopBarNavigator;
import framework.ui.login.LoginPage;
import org.testng.annotations.Test;

public class Second extends BaseTest{
    @Test
    public void flow2() {
        logger.info("Oleg test flow2 STARTED.");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.fillUserName("oleg.glizrin@datorama.com")
                .fillPassword("cm8a7vvp ")
                .clickSignIn()
                .fillEmail("oleg.glizrin@datorama.com")
                .fillPass("Volume99")
                .logIn();
        HomeTopBarNavigator homeTopBarNavigator = new HomeTopBarNavigator(getDriver());
        homeTopBarNavigator.navigateAnalyzeAndAct()
                .handlePopup()
                .createBot();
        logger.info("Oleg test flow2 FINISHED.");
    }
}
