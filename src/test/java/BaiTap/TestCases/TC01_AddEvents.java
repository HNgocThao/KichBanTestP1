package BaiTap.TestCases;

import BaiTap.Actions.PageObject.EventsPageObject;
import ThucHanh.Actions.Commons.BaseTest;
import ThucHanh.Actions.PageObject.LoginPageObject;
import ThucHanh.Actions.PageObject.LogoutPageObject;
import ThucHanh.Utilities.Listeners.ReportListener;
import ThucHanh.Utilities.Listeners.TestListener;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

@Listeners({TestListener.class, ReportListener.class})
public class TC01_AddEvents extends BaseTest {
    private static WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = getDriver();
    }

    @Test(priority = 0)
    public void Test_Login() {
        LoginPageObject.Login(driver,
                "admin@demo.com","riseDemo");
    }

    @Test (priority = 1, dataProvider = "RISE_Login", dataProviderClass = ThucHanh.Utilities.Helpers.PropertiesFile.class)
    @Description("Verify the login function")
    public void Test_CreateEvent(HashMap<String, String> data) throws InterruptedException, AWTException {
        EventsPageObject.CteateEvent(driver,
                data.get("title"), data.get("description"), data.get("start_date"),
                data.get("start_time"), data.get("end_date"), data.get("end_time"),
                data.get("location"), data.get("client"));
    }

    @Test (priority = 2)
    public void Test_Logout() {
        LogoutPageObject.Logout(driver);
    }

    @AfterClass
    public void afterClass() throws Exception{
        tearDown();
    }
}
