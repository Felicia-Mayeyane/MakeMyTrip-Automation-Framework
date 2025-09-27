package TestCases;
import MakeMyTrip.base.BaseTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.IOException;

public class TestSetup extends BaseTest {

    @BeforeSuite
    public void setUp() throws IOException {
        readPropertyFile();
       driverInitialization();
       setExtentReport();
    }
    @AfterSuite
    public void tearDown(){
        extent.flush();
        driver.quit();
    }
}
