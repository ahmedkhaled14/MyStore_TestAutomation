package Gui.MyStore.pages.Register_Pages;

import Gui.MyStore.pages.Product_Pages.MyStore_Category_Page;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_SignIn_Page_1 {

    WebDriver driver;
    private final String URl = System.getProperty("URL");

    private By signIn_button() {
        return By.linkText("Sign in");
    }
    private By Women_Tab() {
        return By.xpath("//a[contains(text(),'Women')and @title='Women']");
    }
    private By Tshirt_Tab(){return By.xpath("(//a[@title='T-shirts'])[1]");}



    public MyStore_SignIn_Page_1(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @return navigate To My Store URL
     */
    public MyStore_SignIn_Page_1 navigateToURL() {
        BrowserActions.navigateToURL(driver, URl);
        return this;
    }

    /**
     * @return Move_cursor_over_Women_link
     */
    public MyStore_SignIn_Page_1 Move_cursor_over_Women_link(){
        ElementActions.hover(driver,Women_Tab());
        return this;
    }

    /**
     * @return Click_on_Tshirt_Tab
     */
    public MyStore_Category_Page Click_on_Tshirt_Tab(){
        ElementActions.click(driver,Tshirt_Tab());
        return new MyStore_Category_Page(driver);
    }

    /**
     * @return MyStore_SignUp_Page_2
     */
    public MyStore_SignUp_Page_2 clickOn_SignIn_button_For_NavigateTo_SignUp_Page() {
        ElementActions.click(driver, signIn_button());
        return new MyStore_SignUp_Page_2(driver);
    }
}


