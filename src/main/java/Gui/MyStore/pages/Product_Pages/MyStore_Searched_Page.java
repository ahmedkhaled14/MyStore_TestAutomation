package Gui.MyStore.pages.Product_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_Searched_Page {
    WebDriver driver ;

    /**
     * @return Searched Product Name
     */
    public static By Searched_Product_Name() {
        return By.xpath("(//a[contains(.,'Faded Short Sleeve T-shirts')])[2]");
    }

    public MyStore_Searched_Page(WebDriver driver){
        this.driver = driver;
    }




}
