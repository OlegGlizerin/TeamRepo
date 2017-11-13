package framework.ui.home.analyzeAndAct;

import browserFactoryMethod.WebDriverFactory;
import framework.ui.AbstractPageObject;
import framework.ui.home.analyzeAndAct.newBot.NewBotPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class AnalyzeAndAct extends AbstractPageObject{
    private By plusIcon = By.xpath("//mat-icon[@svgicon='Plus-01']");
    public AnalyzeAndAct(WebDriver driver) {
        super(driver);
    }

    public AnalyzeAndAct handlePopup() {
//        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//        String subWindowHandler = null;
//
//        Set<String> handles = driver.getWindowHandles(); // get all window handles
//        Iterator<String> iterator = handles.iterator();
//        while (iterator.hasNext()){
//            subWindowHandler = iterator.next();
//        }
//        driver.switchTo().window(subWindowHandler); // switch to popup window
//
//// Now you are in the popup window, perform necessary actions here
//
//        driver.switchTo().window(parentWindowHandler);
//
//
            return this;
    }

    public NewBotPage createBot() {
        bot.switchToFrame("default");
        bot.click(plusIcon);
        return new NewBotPage(driver);
    }


}
