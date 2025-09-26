package MakeMyTrip.pages;
import MakeMyTrip.base.BaseTest;
import Utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    @FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/span/a")
    WebElement FlightMenu;

    @FindBy(xpath = "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[1]/ul/li[2]/span")
    WebElement RoundTrip;

    @FindBy(xpath = "//*[@id=\"fromCity\"]")
    WebElement FromCityDropdown;

    @FindBy(xpath = "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
    WebElement SearchFrom;

    @FindBy(xpath = "//*[@id=\"toCity\"]")
    WebElement ToCityDropdown;

    @FindBy(xpath= "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")
    WebElement SearchTo;

    @FindBy(xpath = "//*[@id=\"departure\"]")
    WebElement DepartureDateDropdown;

    @FindBy(xpath = "//*[@id=\"return\"]")
    WebElement ReturnDateDropdown;

    String DepartureDate = "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[5]";
    String ReturnDate = "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[5]";

    @FindBy(xpath= "//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[2]/p/a")
    WebElement SearchButton;

    public HomePage(){
        super();
        PageFactory.initElements(driver, this);
    }

    public void SelectFlightMenu(){
        FlightMenu.click();
    }
    public void SelectRoundTrip(){
        RoundTrip.click();
    }

    public void enterDepartureCity(){
        FromCityDropdown.click();
        SearchFrom.sendKeys(config.getProperty("From"));
        SearchFrom.sendKeys(Keys.TAB);
    }

    public void enterReturnCity() {
        ToCityDropdown.click();
        SearchTo.sendKeys(config.getProperty("To"));
        SearchTo.sendKeys(Keys.TAB);
    }

    public void enterDepartureDate(){
        DepartureDateDropdown.click();
        TestUtils date = TestUtils.getCurrentDateandReturnDate();
        driver.findElement(TestUtils.customXpath(DepartureDate, date.DepartureDate)).click();
    }

    public void enterReturnDate(){
        ReturnDateDropdown.click();
        TestUtils date = TestUtils.getCurrentDateandReturnDate();
        driver.findElement(TestUtils.customXpath(ReturnDate, date.ReturnDate)).click();
    }

    public void SearchBtn(){
        SearchButton.click();
    }
}







