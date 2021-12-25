package Gui.MyStore.pages.Order_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_OrderAddress_Page {
    WebDriver driver;

    private By Proceed_to_checkout_locator(){return By.name("processAddress");}

    public MyStore_OrderAddress_Page(WebDriver driver){
        this.driver= driver;
    }

    /**
     * @return MyStore_OrderShipping_Page
     */
    public MyStore_OrderShipping_Page Click_On_Proceed_to_checkout_On_AddressPage(){
        ElementActions.click(driver,Proceed_to_checkout_locator());
        return new MyStore_OrderShipping_Page(driver);
    }


}
