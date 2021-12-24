package Gui.MyStore.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyStore_Category_Page {
    WebDriver driver;

    private By productName() {
        return By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]");
    }
    private By Search(){
        return By.name("search_query");
    }
    private By HoverOnTheProduct(){return By.xpath("//img[@title='Faded Short Sleeve T-shirts']");}
    private By More_Button(){return By.xpath("//a[@title='View']");}

    public MyStore_Category_Page(WebDriver driver){
        this.driver = driver;
    }

    private String Get_Product_Name(){
        return ElementActions.getText(driver,productName());
    }

    public MyStore_Searched_Page Get_Product_Name_Then_Search_Using_Product_Name(){
        (new ElementActions(driver)).type(Search(),Get_Product_Name())
                .keyPress(Search(),Keys.ENTER);
        return new MyStore_Searched_Page(driver);
    }

    public MyStore_Product_Page Click_On_More_Button_And_Navigate_To_ProductPage(){
        ElementActions.hoverAndClick(driver,HoverOnTheProduct(),More_Button());
        return new MyStore_Product_Page(driver);
    }


}
