package ThucHanh.Interfaces;

public class ClientsPageUI {

    public static String ClientPage_txt = "//a[@href='https://rise.fairsketch.com/clients']";
    public static String ClientPage_show = "//div[contains(@class ,'card-body')]//span[normalize-space()='Total clients']";
    public static String Client_total = "//span[text()='Total clients']//preceding-sibling::h1";

    public static String TabClient_txt = "//ul[@role='tablist']//a[text()='Clients']";
    public static String ClientDetail_show = "//button[text()='Has due']";
    public static String ClientDetail_total = "//div[@class='dataTables_info']";
}
