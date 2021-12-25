package Gui.MyStore.tests;

import Gui.MyStore.pages.Product_Pages.MyStore_Category_Page;
import Gui.MyStore.pages.Register_Pages.MyStore_SignIn_Page_1;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("My Store")
@Feature("GUI")
public class Gui_Add_to_Wishlist_Test {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver = DriverFactory.getDriver();
    }

    @Description("Given the browser is open, When i navigate to My Store URl, And Move cursor over Women's link, And Click on sub menu 'T-shirts," +
            "And Click On 'Add to Wishlist' button, Then error message is displayed saying 'You must be logged in to manage your wish list.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Add to Wishlist")
    @Test(description = "Verify that 'Add to Wishlist' only works after login")
    public void Add_to_Wishlist(){
        new MyStore_SignIn_Page_1(driver)
                .navigateToURL()
                .Move_cursor_over_Women_link()
                .Click_on_Tshirt_Tab()
                .Click_On_Add_to_Wishlist_Button();

        Validations.assertThat()
                .element(driver,MyStore_Category_Page.You_must_be_logged_message())
                .text()
                .isEqualTo("You must be logged in to manage your wishlist.")
                .withCustomReportMessage("Verify that error message is displayed 'You must be logged in to manage your wish list.")
                .perform();
    }
}
