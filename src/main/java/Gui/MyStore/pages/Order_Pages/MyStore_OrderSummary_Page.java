package Gui.MyStore.pages.Order_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_OrderSummary_Page {
    WebDriver driver ;

    private By confirm_Order(){return By.xpath("(//button[@type='submit'])[2]");}
    public MyStore_OrderSummary_Page(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @return MyStore_OrderConfirmation_Page
     */
    public MyStore_OrderConfirmation_Page Click_On_Confirm_Order(){
        ElementActions.click(driver,confirm_Order());
        return new MyStore_OrderConfirmation_Page(driver);
    }

}
