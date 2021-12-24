package Gui.MyStore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_OrderConfirmation_Page {
    WebDriver driver;
    public static By OrderConfirmMassage(){return By.xpath("//p[contains(.,'Your order on My Store is complete.')]");}
    public MyStore_OrderConfirmation_Page(WebDriver driver){
        this.driver =driver;
    }
}
