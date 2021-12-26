package Gui.MyStore.tests;

import Gui.MyStore.pages.Order_Pages.MyStore_Order_Page;
import Gui.MyStore.pages.Register_Pages.MyStore_SignIn_Page_1;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("My Store")
@Feature("GUI")
public class Gui_Shopping_Cart_Test {
    WebDriver driver;
    private JSONFileManager loginDataJson;
    private JSONFileManager shoppingCartJson;

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();
        loginDataJson = new JSONFileManager(System.getProperty("loginDataJson"));
        shoppingCartJson = new JSONFileManager(System.getProperty("BuyProductJson"));

    }

    @Description("Given the browser is open, When i navigate to My Store URl, And click on sign in button, And SignIn with Valid Email & Password," +
            "And Move cursor over Women's link, And Click on sub menu 'T-shirts, And Mouse hover on the product displayed," +
            "And More button will be displayed click on 'More' button, And Select quantity to 1 , And Select size 'M'," +
            "And Select color, And Click On 'Add to Cart' button, And Click On 'Proceed to checkout' button, And Change quantity to 2," +
            "Then Verify that Total price is changing and reflecting correct price.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Shopping Cart")
    @Test(description = "Verify that Total Price is reflecting correctly if user changes quantity on 'Shopping Cart Summary'")
    public void Shopping_Cart_Summary() {

        new MyStore_SignIn_Page_1(driver)
                .navigateToURL()
                .clickOn_SignIn_button_For_NavigateTo_SignUp_Page()
                .ValidSignIn(loginDataJson.getTestData("Email"), loginDataJson.getTestData("Password"))
                .Move_cursor_over_Women_link_And_Click_on_Tshirt_Tab()
                .Click_On_More_Button_And_Navigate_To_ProductPage()
                .Select_quantity(Integer.parseInt(shoppingCartJson.getTestData("SelectQuantity")))
                .Select_Size(shoppingCartJson.getTestData("SelectSize"))
                .Choose_Color()
                .Click_Add_To_Cart_Button()
                .Click_On_Proceed_to_checkout()
                .Change_the_quantity(Integer.parseInt(shoppingCartJson.getTestData("ChangeTheQuantity")));

        Validations.assertThat()
                .element(driver, MyStore_Order_Page.total_price_locator())
                .text()
                .isEqualTo("$35.02")
                .withCustomReportMessage("Verify that Total price is changing and reflecting correct price.")
                .perform();

    }

    @AfterMethod
    public void afterMethod(){
        BrowserActions.closeCurrentWindow(driver);
    }
}
