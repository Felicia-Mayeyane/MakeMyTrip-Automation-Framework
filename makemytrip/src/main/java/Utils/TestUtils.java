package Utils;

import MakeMyTrip.base.BaseTest;
import org.openqa.selenium.By;

import java.util.Calendar;

public class TestUtils extends BaseTest {

    public static String DepartureDate;
    public static String ReturnDate;

    public static TestUtils getCurrentDateandReturnDate() {
        TestUtils date = new TestUtils();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1);
        String[] DateArr = cal.getTime().toString().split(" ");
        TestUtils.DepartureDate = DateArr[0] + " " + DateArr[1] + " " + DateArr[2] + " " + DateArr[5];
        cal.add(Calendar.DATE, 2);
        DateArr = cal.getTime().toString().split(" ");
        TestUtils.ReturnDate = DateArr[0] + " " + DateArr[1] + " " + DateArr[2] + " " + DateArr[5];
        return date;
    }
    public static By customXpath(String xpath, String parm){
        String rawPath = xpath.replaceAll(" %replace%",parm);
        return By.xpath(rawPath);
    }
}
