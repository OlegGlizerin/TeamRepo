package framework.ui.home.visualize.newpage;

import framework.ui.AbstractPageObject;
import framework.ui.home.visualize.newpage.datoramaWidgets.DatoramaWidget;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewPage extends AbstractPageObject{

    private By topBarTitleInput = By.id("topbar-title-input");
    private By widgetButton = By.xpath("//input[@class='top-add-widget-button']");

    public NewPage(WebDriver driver) {
        super(driver);
    }

    public NewPage fillTitleInput(String text) {
        bot.type(topBarTitleInput, text);
        return this;
    }

    public DatoramaWidget addWidget() {
        bot.click(widgetButton);
        return new DatoramaWidget(driver);
    }

}
