package ThucHanh.TestCases;

import ThucHanh.Actions.Commons.BaseTest;
import ThucHanh.Actions.PageObject.ClientsPageObject;
import ThucHanh.Actions.PageObject.LoginPageObject;
import ThucHanh.Actions.PageObject.LogoutPageObject;
import ThucHanh.Utilities.Listeners.ReportListener;
import ThucHanh.Utilities.Listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class, ReportListener.class})
public class TC01_ClientsPage extends BaseTest {
    private static WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver = getDriver();
    }

    @Test (priority = 0)
    public void Test_Login() {
        LoginPageObject.Login(driver, "admin@demo.com", "riseDemo");
    }

    @Test (priority = 1)
    public void Test_ClientPage() {
        ClientsPageObject.ClientPage(driver);

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
