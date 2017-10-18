import Logger.Logger;
import browserFactoryMethod.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public abstract class BaseTest {

    protected ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();
    protected Logger logger = Logger.getInstance();

    @BeforeClass
    public void testInit(){
        logger.clear();
    }

    @BeforeMethod(alwaysRun=true)
    public void init() {

        WebDriver driver = WebDriverFactory.getDriver(WebDriverFactory.DriverType.CHROME);
        threadDriver.set(driver);
//        threadDriver.get().get("https://ci-platform.datorama.com/login");
//        long id = Thread.currentThread().getId();
        //System.out.println("Before test-method. Thread id is: " + id);
    }

    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
       // System.out.println("After test-method. Thread id is: " + id);
    }

    public WebDriver getDriver() {
        return threadDriver.get();
    }
}
