package framework.ui.login;

import framework.ui.AbstractPageObject;
import framework.ui.login.onelogin.DatoramaOneLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPageObject {

    private By userName = By.xpath("//form[@name='loginForm']/div/div/input[@name='email']");
    private By password = By.xpath("//form[@name='loginForm']/div/div/input[@name='password']");
    private By signInButton = By.xpath("//form[@name='loginForm']/div/button[@type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage fillUserName(String user) {
        bot.type(userName, user);
        return this;
    }

    public LoginPage fillPassword(String pass) {
        bot.type(password, pass);
        return this;
    }

    public DatoramaOneLoginPage clickSignIn() {
        bot.click(signInButton);
        return new DatoramaOneLoginPage(driver);
    }


}
