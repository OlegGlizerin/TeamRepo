package framework.actionbot;

import Logger.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

public abstract class AbstractBot {
    protected WebDriver driver;
    protected WebElement baseWebElement;
    protected WebDriverWait webDriverWait;
    protected Logger logger = Logger.getInstance();



    public AbstractBot(WebDriver webDriver) {
        driver = webDriver;
        webDriverWait = new WebDriverWait(driver,10);
    }



    protected WebElement findControl(By locator) {
        try {
            waitForElementClickable(locator);
            waitForElementFluent(locator);
            return baseWebElement;

        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(locator.toString());
        }
    }


    private void waitForElementFluent(By locator) {
        logger.warning("Fluent wait for element " + locator.toString() + " for 30 seconds.");
        Wait<WebDriver> stubbornWait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }



    private void waitForElementClickable(By locator) {
        logger.warning("Wait for element to be clickable: " + locator.toString());
        try {
            baseWebElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
            waitForControlToStopMoving();
        } catch (InterruptedException e) {

        } catch (TimeoutException e) {
           e.getStackTrace();
        }
        if (baseWebElement == null) {
            baseWebElement = driver.findElement(locator);
        }
    }

    private void waitForControlToStopMoving() throws InterruptedException {
        Point elementStartLocation = baseWebElement.getLocation();
        Thread.sleep(5);
        Point elementCurrentLocation = baseWebElement.getLocation();
        while (!elementCurrentLocation.equals(elementStartLocation)) {
            elementStartLocation = elementCurrentLocation;
            Thread.sleep(5);
            elementCurrentLocation = baseWebElement.getLocation();
        }
    }

    public void switchToFrame(String frameTitleId) {
        if(frameTitleId.equals("default")){
            driver.switchTo().defaultContent();
            return;
        }
        waitForElementClickable(By.id(frameTitleId));
        driver.switchTo().frame(frameTitleId);
    }

}
