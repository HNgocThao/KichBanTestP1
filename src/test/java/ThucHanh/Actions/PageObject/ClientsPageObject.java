package ThucHanh.Actions.PageObject;

import ThucHanh.Actions.Commons.BasePage;
import ThucHanh.Interfaces.ClientsPageUI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ClientsPageObject {
    private static BasePage basePage = new BasePage();

    //ClientPage+Detail
    public static void ClientPage(WebDriver driver){
        basePage.clickToElement(driver, ClientsPageUI.ClientPage_txt);
        basePage.isElementDisplayed(driver, ClientsPageUI.ClientPage_show);
        String totalOverview = TotalClientOverview(driver);

        basePage.clickToElement(driver, ClientsPageUI.TabClient_txt);
        basePage.isElementDisplayed(driver, ClientsPageUI.ClientDetail_show);
        String totalClientTab = getTotalClientOnClientTab(driver);

        if (totalClientTab == totalClientTab){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        Assert.assertEquals(totalOverview, totalClientTab);
    }

    //Total view
    public static String TotalClientOverview(WebDriver driver){
        basePage.waitForElementVisible(driver, ClientsPageUI.Client_total);
        String totals = basePage.getElementText(driver, ClientsPageUI.Client_total).trim();
        return totals;
    }

    //Total view in detail page
    public static String getTotalClientOnClientTab(WebDriver driver){
        basePage.scrollToBottomPage(driver);
        basePage.waitForElementVisible(driver, ClientsPageUI.ClientDetail_total);
        String[] substrings = basePage.getElementText(driver, ClientsPageUI.ClientDetail_total).split(" ");
        //lấy chuối cuối cùng
        return substrings[substrings.length - 1].trim();
    }
}
