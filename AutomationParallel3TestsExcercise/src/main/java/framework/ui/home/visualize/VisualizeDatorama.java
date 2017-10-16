package framework.ui.home.visualize;

import framework.ui.AbstractPageObject;
import framework.ui.home.visualize.newpage.NewPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VisualizeDatorama extends AbstractPageObject{

    private By favoriteButton = By.xpath("//span[@class='boxtitle' and text()='Oleg']/../div[2]");
    private By addNewPageButton = By.xpath("//span[@class='boxtitle' and text()='Oleg']/../span[@class='boxfooteraddpage']/a");

    public VisualizeDatorama(WebDriver driver) {
        super(driver);
        bot.switchToFrame("legacyFrame");
    }


    public VisualizeDatorama clickFavoriteButton() {
        bot.click(favoriteButton);
        return this;
    }

    public NewPage clickAddNewPageButton() {
        bot.click(addNewPageButton);
        return new NewPage(driver);
    }


}
