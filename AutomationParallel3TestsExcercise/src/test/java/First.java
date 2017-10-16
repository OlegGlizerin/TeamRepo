import Logger.Logger;
import framework.ui.login.LoginPage;
import org.testng.annotations.*;


public class First extends BaseTest{



    @Test
    public void flow1() {
        logger.info("Oleg test flow1 STARTED.");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.fillUserName("oleg.glizrin@datorama.com")
                .fillPassword("cm8a7vvp ")
                .clickSignIn()
                .fillEmail("oleg.glizrin@datorama.com")
                .fillPass("Volume99")
                .logIn()
//        HomeTopBarNavigator homeTopBarNavigator = new HomeTopBarNavigator(vd.getDriver());
//        homeTopBarNavigator.navigateVisualize()
                .clickFavoriteButton()
                .clickAddNewPageButton()
                .fillTitleInput("New Test Page")
                .addWidget()
                .clickOverview()
                .clickConversionGeoDistribution();
//                .fillName("New Flow 1 check");
        logger.info("Oleg test flow1 FINISHED.");
    }





}
