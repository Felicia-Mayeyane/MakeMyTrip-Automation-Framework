package TestCases;
import MakeMyTrip.base.BaseTest;
import MakeMyTrip.pages.HomePage;
import org.testng.annotations.Test;

public class FlightTest extends BaseTest {
    @Test
    public void searchFlight(){
        HomePage home = new HomePage();
        home.SelectFlightMenu();
        home.SelectRoundTrip();
        home.enterDepartureCity();
        home.enterReturnCity();
        home.enterDepartureDate();
        home.enterReturnDate();
        home.SearchBtn();


    }
}
