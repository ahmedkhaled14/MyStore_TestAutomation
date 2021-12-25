package Gui.MyStore.pages.Order_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_Order_Page {
    WebDriver driver;

    private By Proceed_to_checkout_locator(){return By.xpath("(//a[@title='Proceed to checkout'])[2]");}

    public MyStore_Order_Page(WebDriver driver){
        this.driver = driver;
    }

    public MyStore_OrderAddress_Page Click_On_Proceed_to_checkout_On_OrderPage(){
        ElementActions.click(driver,Proceed_to_checkout_locator());
        return new MyStore_OrderAddress_Page(driver);
    }
}
