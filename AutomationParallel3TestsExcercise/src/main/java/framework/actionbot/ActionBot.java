package framework.actionbot;

import org.openqa.selenium.*;

public class ActionBot extends AbstractBot {
    private WebDriver webDriver = null;

    public ActionBot(WebDriver driver) {
        super(driver);
        this.webDriver = driver;

    }

    public void click(By locator) {
        try {
            findControl(locator).click();
            logger.info("click the element: " + locator.toString());
        }
        catch(WebDriverException e) {

        }
    }

    public boolean isVisible(By locator) {
        try {
            return findControl(locator).isDisplayed();
        } catch (ElementNotVisibleException e) {
            return false;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void submit(By locator) {
        findControl(locator).submit();
    }

    public String readText(By locator) {
        return findControl(locator).getText();
    }

    public String readAttribute(By locator, String attribute) {
        return findControl(locator).getAttribute("value");
    }

    public void type(By locator, String text) {
        WebElement element = findControl(locator);
        try {
            element.sendKeys(text);
            logger.info("write data : " + text + " . To Element: " + locator.toString());
        }
        catch (StaleElementReferenceException e ) {

                int count = 0;
                //It will try 4 times to find same element using name.
                while (count < 4) {
                    try {
                        //If exception generated that means It Is not able to find element then catch block will handle It.
                        element = findControl(locator);
                        element.sendKeys(text);
                        count = count + 4;

                    } catch (StaleElementReferenceException e2) {
                        e2.toString();
                        logger.warning("Trying to recover from a stale element :" + e2.getMessage());
                        count = count + 1;
                    }

                }

        }
    }

    public void openUrl(String url) {
        webDriver.get(url);
    }

}
