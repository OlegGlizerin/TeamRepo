
import browserFactoryMethod.WebDriverFactory;
import il.co.topq.difido.ReportDispatcher;
import il.co.topq.difido.ReportManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Listeners(il.co.topq.difido.ReportManagerHook.class)
public abstract class BaseTest {

    protected ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();
    private ReportDispatcher report = ReportManager.getInstance();

    protected ThreadLocal<ReportDispatcher> threadLocalLogger = new ThreadLocal<ReportDispatcher>();

    @BeforeClass
    public void testInit(){
        threadLocalLogger.set(report);
        threadLocalLogger.get().log("Test init. Thread ID: " + Thread.currentThread().getId());
        WebDriver driver = WebDriverFactory.getDriver(WebDriverFactory.DriverType.CHROME);
        threadDriver.set(driver);
    }


    @AfterTest
    public void afterMethod() {
        threadDriver.get().quit();
    }

    public WebDriver getDriver() {
        return threadDriver.get();
    }
}
