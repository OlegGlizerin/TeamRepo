package framework.ui.login.onelogin;

import framework.ui.AbstractPageObject;
import framework.ui.home.visualize.VisualizeDatorama;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatoramaOneLoginPage extends AbstractPageObject {

    private By email = By.id("user_email");
    private By pass = By.id("user_password");
    private By loginButton = By.id("user_submit");

    public DatoramaOneLoginPage(WebDriver driver) {
        super(driver);
    }

    public DatoramaOneLoginPage fillEmail(String emailText) {
        bot.type(email, emailText);
        return this;
    }

    public DatoramaOneLoginPage fillPass(String passText) {
        bot.type(pass, passText);
        return this;
    }

    public VisualizeDatorama logIn() {
        bot.click(loginButton);
        return new VisualizeDatorama(driver);
    }

    public WebDriver getWebDriver() {
        return driver;
    }

}
