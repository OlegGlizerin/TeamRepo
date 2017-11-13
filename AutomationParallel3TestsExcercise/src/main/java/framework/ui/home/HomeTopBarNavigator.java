package framework.ui.home;

import browserFactoryMethod.WebDriverFactory;
import framework.ui.AbstractPageObject;
import framework.ui.home.analyzeAndAct.AnalyzeAndAct;
import framework.ui.home.connectAndMix.ConnectAndMix;
import framework.ui.home.visualize.VisualizeDatorama;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeTopBarNavigator extends AbstractPageObject {
    By visualize = By.xpath("//span[@class='nav-caption' and text()='Visualize ']");
    By analyzeAndAct = By.xpath("//span[@class='nav-caption' and text()='Analyze & Act ']");
    By connectAndMix = By.xpath("//span[@class='nav-caption' and text()='Connect & Mix ']");

    public HomeTopBarNavigator(WebDriver driver) {
        super(driver);
    }

    public VisualizeDatorama navigateVisualize() {
        bot.switchToFrame("legacyFrame");
        bot.click(visualize);
        return new VisualizeDatorama(driver);
    }

    public AnalyzeAndAct navigateAnalyzeAndAct() {
        bot.switchToFrame("default");
        bot.click(analyzeAndAct);
        return new AnalyzeAndAct(driver);
    }

    public ConnectAndMix navigateConnectAndMix() {
        bot.switchToFrame("default");
        bot.click(connectAndMix);
        return new ConnectAndMix(driver);
    }
}
