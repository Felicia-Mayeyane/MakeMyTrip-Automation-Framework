package MakeMyTrip.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public static Properties config;
    public static WebDriver driver;

    public void driverInitialization() {
        driver = new ChromeDriver();
        driver.get(config.getProperty("url"));
        driver.manage().window().maximize();
        WebDriver.Timeouts pageLoadTimeOut = driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(config.getProperty("pageLoadTimeOut"))));driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(config.getProperty("pageLoadTimeOut"))));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
    }
    public void readPropertyFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/feliciamayeyane/Documents/MakeMyTrip/MakeMyTrip-Automation-Framework/makemytrip/src/resources/Property/config.properties");
        config = new Properties();
        try {
            config.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

