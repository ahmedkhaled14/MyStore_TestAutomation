package Gui.MyStore.tests;

import Gui.MyStore.pages.Order_Pages.MyStore_OrderConfirmation_Page;
import Gui.MyStore.pages.Register_Pages.MyStore_SignIn_Page_1;
import com.shaft.driver.DriverFactory;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("My Store")
@Feature("GUI")
public class Gui_Buy_Product_Test {
    WebDriver driver;
    JSONFileManager loginDataJson;
    JSONFileManager BuyProductJson;

    @BeforeMethod
    public void beforeMethod(){
        driver = DriverFactory.getDriver();
        loginDataJson =new JSONFileManager(System.getProperty("loginDataJson"));
        BuyProductJson = new JSONFileManager("src/test/resources/testDataFiles/MyStoreRegistrationData/OrderTestData/BuyProduct.json");
    }


    @Description("Given the browser is open, When i navigate to My Store URl, And click on sign in button, And SignIn with Valid Email & Password," +
            "And Move cursor over Women's link, And Click on sub menu 'T-shirts, And Mouse hover on the product displayed," +
            "And More button will be displayed click on 'More' button, And Increase quantity to 2 , And Select size 'L'," +
            "And Select color, And Click On 'Add to Cart' button, And Click On 'Proceed to checkout' button," +
            "And  Complete the buy order process till payment, Then Make sure that Product is ordered ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("End-To-End Buy Product ")
    @Test(description = "Buy Product")
    public void Buy_Product(){
        new MyStore_SignIn_Page_1(driver)
                .navigateToURL()
                .clickOn_SignIn_button_For_NavigateTo_SignUp_Page()
                .ValidSignIn(loginDataJson.getTestData("Email"),loginDataJson.getTestData("Password"))
                .Move_cursor_over_Women_link_And_Click_on_Tshirt_Tab()
                .Click_On_More_Button_And_Navigate_To_ProductPage()
                .Increase_quantity(Integer.parseInt(BuyProductJson.getTestData("ProductQuantity")))
                .Select_Size(BuyProductJson.getTestData("productSize"))
                .Choose_Color()
                .Click_Add_To_Cart_Button()
                .Click_On_Proceed_to_checkout()
                .Click_On_Proceed_to_checkout_On_OrderPage()
                .Click_On_Proceed_to_checkout_On_AddressPage()
                .agree_To_The_terms()
                .Click_On_Proceed_to_checkout_On_ShippingPage()
                .Click_On_Pay_by_check()
                .Click_On_Confirm_Order();

        Validations.assertThat()
                .element(driver, MyStore_OrderConfirmation_Page.OrderConfirmMassage())
                .text()
                .contains(BuyProductJson.getTestData("OrderConfirmMassage"))
                .withCustomReportMessage(" Validate that Product is ordered")
                .perform();

    }
}


