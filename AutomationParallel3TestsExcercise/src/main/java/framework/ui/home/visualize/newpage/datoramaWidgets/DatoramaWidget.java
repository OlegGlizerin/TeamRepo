package framework.ui.home.visualize.newpage.datoramaWidgets;

import framework.ui.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DatoramaWidget extends AbstractPageObject{
    private By overviewButton = By.xpath("//span[text()='Overview']");

    public DatoramaWidget(WebDriver driver) {
        super(driver);
//        bot.switchToFrame("walkme-hidden-iframe");
    }

    public OverviewPage clickOverview() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        String currentFrame = ((JavascriptExecutor) driver).executeScript("return window.frameElement").toString();
        bot.click(overviewButton);
        return new OverviewPage(driver);
    }
}
