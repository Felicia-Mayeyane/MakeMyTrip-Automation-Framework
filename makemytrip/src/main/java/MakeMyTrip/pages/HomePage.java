package MakeMyTrip.pages;
import MakeMyTrip.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseTest {
    public void Sample(){
        driver.findElement(By.xpath("")).click();

    }

    @FindBy(xpath = )
    WebElement SubmitBtn;

    public void ClickSubmit(){
        SubmitBtn.click();
    }

}
