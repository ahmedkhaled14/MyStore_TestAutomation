package Gui.MyStore.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_MyAccount_Page_4 {
    WebDriver driver;

    public static By ViewAccountText() {
        return By.xpath("//a[@title='View my customer account']");
    }
    private By Women_Tab() {
        return By.xpath("//a[contains(text(),'Women')and @title='Women']");
    }
    private By Tshirt_Tab(){return By.xpath("(//a[@title='T-shirts'])[1]");}

    public MyStore_MyAccount_Page_4(WebDriver driver) {
        this.driver = driver;
    }

    public MyStore_Category_Page Move_cursor_over_Women_link_And_Click_on_Tshirt_Tab(){
        ElementActions.hover(driver,Women_Tab());
        ElementActions.click(driver,Tshirt_Tab());
        return new MyStore_Category_Page(driver);
    }

}
