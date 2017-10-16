package framework.ui.home.visualize.newpage.datoramaWidgets;

import framework.ui.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends AbstractPageObject {
    private By conversionGeoDistribution = By.xpath("//div[text()='Conversions Geo Distribution']");


    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public ConversionsGeoDistributionOverview clickConversionGeoDistribution() {
        bot.click(conversionGeoDistribution);
        return new ConversionsGeoDistributionOverview(driver);
    }
}
