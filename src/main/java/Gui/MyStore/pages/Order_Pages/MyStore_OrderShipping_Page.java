package Gui.MyStore.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_OrderShipping_Page {
    WebDriver driver;

    private By Proceed_to_checkout_locator(){return By.xpath("(//button[@type='submit'])[2]");}
    private By agree_terms(){return By.id("uniform-cgv");}

    public MyStore_OrderShipping_Page(WebDriver driver){
        this.driver= driver;
    }

    public MyStore_OrderShipping_Page agree_To_The_terms(){
        ElementActions.click(driver,agree_terms());
        return this;
    }

    public MyStore_OrderPayment_Page Click_On_Proceed_to_checkout_On_ShippingPage(){
        ElementActions.click(driver,Proceed_to_checkout_locator());
        return new MyStore_OrderPayment_Page(driver);
    }

}
