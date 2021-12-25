package Gui.MyStore.pages.Product_Pages;

import Gui.MyStore.pages.Order_Pages.MyStore_Order_Page;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_Product_Page {
    WebDriver driver;
    private By quantity_wanted(){return By.id("quantity_wanted");}
    private By Size_Wanted(){return By.id("group_1");}
    private By Color_Wanted(){return By.id("color_14");}
    private By Submit(){return By.name("Submit");}
    private By Proceed_to_checkout_locator(){return By.xpath("//a[@title='Proceed to checkout']");}


    public MyStore_Product_Page(WebDriver driver) {
        this.driver = driver;
    }

    public MyStore_Product_Page Select_quantity(int WantedQuantity){
        ElementActions.type(driver,quantity_wanted(), String.valueOf(WantedQuantity));
        return this;
    }

    /**
     * @param WantedSize String Value (S - M - L)
     * @return Product Size
     */
    public MyStore_Product_Page Select_Size(String WantedSize ){
        ElementActions.select(driver,Size_Wanted(),WantedSize);
        return this;
    }

    /**
     * @return choose Blue Color
     */
    public MyStore_Product_Page Choose_Color(){
        ElementActions.click(driver,Color_Wanted());
        return this;
    }

    /**
     * @return Click on Add To Cart Button
     */
    public MyStore_Product_Page Click_Add_To_Cart_Button (){
       ElementActions.click(driver,Submit());
        return this;
    }

    /**
     * @return MyStore_Order_Page
     */
    public MyStore_Order_Page Click_On_Proceed_to_checkout(){
        ElementActions.click(driver,Proceed_to_checkout_locator());
        return new MyStore_Order_Page(driver);
    }

}
