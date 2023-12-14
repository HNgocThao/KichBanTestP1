package BaiTap.Actions.PageObject;

import ThucHanh.Actions.Commons.BasePage;
import BaiTap.Interfaces.EventsPageUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class EventsPageObject {

    private static BasePage basePage = new BasePage();

    public static void CteateEvent(WebDriver driver, String title, String description, String start_date,
                                   String start_time, String end_date, String end_time, String location, String client) throws InterruptedException, AWTException{
        basePage.isElementDisplayed(driver, EventsPageUI.Events_txt);
        basePage.clickToElement(driver, EventsPageUI.Events_txt);
        basePage.clickToElement(driver, EventsPageUI.AddEvents_txt);
        basePage.sendKeyToElement(driver, EventsPageUI.Title_txb, title);
        basePage.clickToElement(driver, EventsPageUI.Description_area);
        basePage.sendKeyToElement(driver, EventsPageUI.Description_area2, description);
        basePage.sendKeyToElement(driver, EventsPageUI.Startdate_txb, start_date);
        basePage.sendKeyToElementClick(driver, EventsPageUI.Starttime_txb, start_time);
        basePage.sendKeyToElementClick(driver, EventsPageUI.Enddate_txb, end_date);
        basePage.sendKeyToElementClick(driver, EventsPageUI.Endtime_txb, end_time);
        basePage.sendKeyToElementClick(driver, EventsPageUI.Location_txt, location);

        basePage.clickToElement(driver, EventsPageUI.Client_txt);
        basePage.sendKeyToElement(driver, EventsPageUI.Client_txt2, client);
        basePage.sendKeyToEnter(driver, EventsPageUI.Client_txt2);
        basePage.checkToCheckboxRadio(driver, EventsPageUI.Sharewith_checkbox);
        basePage.clickToElement(driver, EventsPageUI.Color_box);

        basePage.clickToElement(driver, EventsPageUI.Upload_Pic);
        Thread.sleep(1000);
//        basePage.sendKeyToElement(driver, EventsPageUI.Upload_Pic, System.getProperty("user.dir") + "src/resource/ten.jpg");

        //Upload File
        Robot rb = new Robot();
        // copying File path to Clipboard
        StringSelection str = new StringSelection("C:\\Users\\OS\\IdeaProjects2\\KichBanTestP1\\src\\resource\\ten.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);
        basePage.clickToElement(driver, EventsPageUI.Save_btn);
        basePage.clickToElement(driver, EventsPageUI.Close_btn);

    }
}
