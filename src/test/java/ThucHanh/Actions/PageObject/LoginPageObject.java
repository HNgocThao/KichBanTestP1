package ThucHanh.Actions.PageObject;

import ThucHanh.Actions.Commons.BasePage;
import ThucHanh.Interfaces.LoginPageUI;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {

    private static BasePage basePage = new BasePage();

    public static void Login(WebDriver driver , String username, String password){
        basePage.sendKeyToElement(driver, LoginPageUI.Username_txt,username);
        basePage.sendKeyToElement(driver,LoginPageUI.Password_txt,password);
        basePage.clickToElement(driver,LoginPageUI.Login_btn);
    }

}
