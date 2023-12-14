package BaiTap.Interfaces;

public class EventsPageUI {

    public static String Events_txt = "//span[text()='Events']";
    public static String AddEvents_txt = "//a[text()=\" Add event\"]";
    public static String Title_txb = "//input[@id='title']";
    public static String Description_area = "//textarea";
    public static String Description_area2 = "//div[@class='note-editable']";
    public static String Startdate_txb = "//input[@name='start_date']";
    public static String Starttime_txb = "//input[@name='start_time']";
    public static String Enddate_txb = "//input[@name='end_date']";
    public static String Endtime_txb = "//input[@name='end_time']";
    public static String Location_txt = "//input[@id='location']";
    public static String Client_txt = "(//a[@href='javascript:void(0)'])[2]";
    public static String Client_txt2 = "//div[@class=\"modal fade\"]//following::input[@aria-autocomplete=\"list\"]";
    public static String Sharewith_checkbox = "//input[@id=\"share_with_all\"]";
    public static String Color_box = "//span[@data-color=\"#f1c40f\"]";

    public static String Upload_Pic = "//button[text()=\" Upload File\"]";

    public static String Save_btn = "//button[@type='submit']";
    public static String Close_btn = "//button[text()=\" Close\"]";
}
