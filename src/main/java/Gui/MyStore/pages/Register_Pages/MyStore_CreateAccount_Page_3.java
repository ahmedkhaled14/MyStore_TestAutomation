package Gui.MyStore.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_CreateAccount_Page_3 {
    WebDriver driver;

    private By title() {
        return By.id("uniform-id_gender1");
    }

    private By customer_firstName() {
        return By.id("customer_firstname");
    }

    private By customer_lastname() {
        return By.id("customer_lastname");
    }

    private By password() {
        return By.id("passwd");
    }

    private By days() {
        return By.id("days");
    }

    private By months() {
        return By.id("months");
    }

    private By years() {
        return By.id("years");
    }

    private By Receive_special_offers() {
        return By.id("uniform-optin");
    }

    private By firstName() {
        return By.id("firstname");
    }

    private By lastname() {
        return By.id("lastname");
    }

    private By company() {
        return By.id("company");
    }

    private By address1() {
        return By.id("address1");
    }

    private By address2() {
        return By.id("address2");
    }

    private By city() {
        return By.id("city");
    }

    private By state() {
        return By.id("id_state");
    }

    private By postcode() {
        return By.id("postcode");
    }

    private By country() {
        return By.id("id_country");
    }

    private By additional_information() {
        return By.id("other");
    }

    private By home_phone() {
        return By.id("phone");
    }

    private By phone_mobile() {
        return By.id("phone_mobile");
    }

    private By alias() {
        return By.id("alias");
    }

    private By submitAccount() {
        return By.id("submitAccount");
    }

    public static By mandatory_fields_error_message_Locator(){
        return By.xpath("//p[contains(text(),'There are ')]");
    }

    public MyStore_CreateAccount_Page_3(WebDriver driver) {
        this.driver = driver;
    }

    public MyStore_CreateAccount_Page_3 Add_NewAccount_registration_Data
            (
                    String customer_firstName, String customer_lastname, String password,
                    String days, String months, String years, String firstName, String lastname, String company,
                    String address1, String address2, String city, String state, String postcode, String country,
                    String additional_information, String home_phone, String phone_mobile, String alias
            ) {
        ElementActions.click(driver, title());
        ElementActions.type(driver, customer_firstName(), customer_firstName);
        ElementActions.type(driver, customer_lastname(), customer_lastname);
        ElementActions.type(driver, password(), password);
        ElementActions.select(driver, days(), days);
        ElementActions.select(driver, months(), months);
        ElementActions.select(driver, years(), years);
        ElementActions.click(driver, Receive_special_offers());
        ElementActions.type(driver, firstName(), firstName);
        ElementActions.type(driver, lastname(), lastname);
        ElementActions.type(driver, company(), company);
        ElementActions.type(driver, address1(), address1);
        ElementActions.type(driver, address2(), address2);
        ElementActions.type(driver, city(), city);
        ElementActions.select(driver, state(), state);
        ElementActions.type(driver, postcode(), postcode);
        ElementActions.select(driver, country(), country);
        ElementActions.type(driver, additional_information(), additional_information);
        ElementActions.type(driver, home_phone(), home_phone);
        ElementActions.type(driver, phone_mobile(), phone_mobile);
        ElementActions.type(driver, alias(), alias);
        return this;
    }

    public MyStore_MyAccount_Page_4 ClickOn_SubmitAccount_For_NavigateTo_My_Account_page() {
        ElementActions.click(driver, submitAccount());
        return new MyStore_MyAccount_Page_4(driver);
    }


}
