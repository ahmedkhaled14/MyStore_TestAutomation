package Gui.MyStore.tests;

import Gui.MyStore.pages.MyStore_CreateAccount_Page_3;
import Gui.MyStore.pages.MyStore_MyAccount_Page_4;
import Gui.MyStore.pages.MyStore_SignIn_Page_1;
import Gui.MyStore.pages.MyStore_SignUp_Page_2;
import com.shaft.driver.DriverFactory;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Util;

@Epic("My Store")
@Feature("GUI")
public class Gui_Register_Test {

    WebDriver driver;
    private JSONFileManager registrationDataJson;

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();
        registrationDataJson = new JSONFileManager(System.getProperty("registrationDataJson"));
    }


    @Description("Given the browser is open, When i navigate to My Store URl, And click on sign in button, And Type Valid New Email," +
            "And navigate to create account page, And Add new account registration data, Then navigate to my account page ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Registration")
    @Test(description = "User Registration ")
    public void UserRegistration() {
        new MyStore_SignIn_Page_1(driver)
                .navigateToURL()
                .clickOn_SignIn_button_For_NavigateTo_SignUp_Page()
                .typeValidNewEmail(Util.GenerateCurrentDateAndTime())
                .NavigateTo_CreateAccount_Page()
                .Add_NewAccount_registration_Data(
                        registrationDataJson.getTestData("customer_firstName"),
                        registrationDataJson.getTestData("customer_lastname"),
                        registrationDataJson.getTestData("password") + Util.GenerateCurrentDateAndTime(),
                        registrationDataJson.getTestData("days"),
                        registrationDataJson.getTestData("months"),
                        registrationDataJson.getTestData("years"),
                        registrationDataJson.getTestData("firstName"),
                        registrationDataJson.getTestData("lastname"),
                        registrationDataJson.getTestData("company"),
                        registrationDataJson.getTestData("address1"),
                        registrationDataJson.getTestData("address2"),
                        registrationDataJson.getTestData("city"),
                        registrationDataJson.getTestData("state"),
                        registrationDataJson.getTestData("postcode"),
                        registrationDataJson.getTestData("country"),
                        registrationDataJson.getTestData("additional_information"),
                        registrationDataJson.getTestData("home_phone"),
                        registrationDataJson.getTestData("phone_mobile"),
                        registrationDataJson.getTestData("alias")
                )
                .ClickOn_SubmitAccount_For_NavigateTo_My_Account_page();

        Validations.assertThat()
                .element(driver, MyStore_MyAccount_Page_4.ViewAccountText())
                .text()
                .contains(registrationDataJson.getTestData("customer_firstName"))
                .withCustomReportMessage("assert that the new account created with the user name ")
                .perform();
    }

    @Description("Given the browser is open, When i navigate to My Store URl, And click on sign in button, And Type InValid New Email," +
            " Then an error message is displaying saying Invalid email address. ")
    @Story("Registration")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "Verify invalid email address error")
    public void Verify_invalid_email_address_error() {

        new MyStore_SignIn_Page_1(driver)
                .navigateToURL()
                .clickOn_SignIn_button_For_NavigateTo_SignUp_Page()
                .typeInValidEmail("invalidEmail")
                .NavigateTo_CreateAccount_Page();

        Validations.assertThat()
                .element(driver, MyStore_SignUp_Page_2.InvalidEmailAddressMessage())
                .text()
                .contains("Invalid email address.")
                .withCustomReportMessage("assert that an error message is displaying saying Invalid email address.")
                .perform();

    }

    @Description("Given the browser is open, When i navigate to My Store URl, And click on sign in button, And Type Valid New Email,And navigate to create account page," +
            " And Add new account registration data Without mandatory fields, Then an error message is displaying saying There are 9 errors.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Registration")
    @Test(description = "Verify error messages for mandatory fields")
    public void Verify_error_messages_for_mandatory_fields() {
        new MyStore_SignIn_Page_1(driver)
                .navigateToURL()
                .clickOn_SignIn_button_For_NavigateTo_SignUp_Page()
                .typeValidNewEmail(Util.GenerateCurrentDateAndTime())
                .NavigateTo_CreateAccount_Page()
                .Add_NewAccount_registration_Data(
                        "",
                        "",
                        "",
                        registrationDataJson.getTestData("days"),
                        registrationDataJson.getTestData("months"),
                        registrationDataJson.getTestData("years"),
                        "",
                        "",
                        registrationDataJson.getTestData("company"),
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        registrationDataJson.getTestData("additional_information"),
                        "",
                        "",
                        registrationDataJson.getTestData("alias")
                )
                .ClickOn_SubmitAccount_For_NavigateTo_My_Account_page();

        Validations.assertThat()
                .element(driver, MyStore_CreateAccount_Page_3.mandatory_fields_error_message_Locator())
                .text()
                .contains("There are 9 errors")
                .withCustomReportMessage("assert that an error message is displaying saying There are 9 errors.")
                .perform();

    }


}
