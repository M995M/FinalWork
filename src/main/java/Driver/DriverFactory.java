package Driver;

import Functions.Assertions;
import Functions.Elements;
import Functions.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class DriverFactory {
    static Waiters wait;
    static Assertions assertions;
    static Elements elements;
    private static WebDriver driver;
    private static final long IMPLICITY_WAIT = 20L;
    private static WebDriver setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT, TimeUnit.SECONDS);
        wait = new Waiters(driver);
        assertions = new Assertions(driver);
        elements = new Elements(driver);
        return driver;
    }
    private static WebDriver getInstance() {
        if(driver == null){
            try {
                driver = setUpDriver();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static WebDriver startChromeDriver(){
        driver = getInstance();
        return driver;
    }
}
