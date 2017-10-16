package framework.ui;

import framework.actionbot.ActionBot;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPageObject {
    protected final WebDriver driver;
    protected final ActionBot bot;

    public AbstractPageObject(WebDriver driver) {
        this.driver = driver;
        bot = new ActionBot(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
