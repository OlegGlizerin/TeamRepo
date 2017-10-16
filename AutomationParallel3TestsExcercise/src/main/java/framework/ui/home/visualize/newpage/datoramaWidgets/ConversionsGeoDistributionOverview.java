package framework.ui.home.visualize.newpage.datoramaWidgets;

import framework.ui.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConversionsGeoDistributionOverview extends AbstractPageObject {
    private By name = By.xpath("//input[@id='txtWidgetName']");

    public ConversionsGeoDistributionOverview(WebDriver driver) {
        super(driver);
        bot.switchToFrame("walkme-hidden-iframe");
    }

    public ConversionsGeoDistributionOverview fillName(String nameText) {

        bot.type(name, nameText);
        return this;
    }
}
