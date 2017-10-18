package browserFactoryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    private static WebDriver driver = null;
    public enum DriverType {
        CHROME, FIREFOX, IE11
    }

    public synchronized static WebDriver getDriver(DriverType type) {

            switch (type) {
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                default:
                    break;
            }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        return driver;
    }
}
