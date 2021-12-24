package Gui.MyStore.pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_SignUp_Page_2 {

    WebDriver driver;

    //Elements
    private By email_TextBox() {
        return By.id("email_create");
    }
    private By submitCreate() {
        return By.id("SubmitCreate");
    }
    private By Email_Input(){return By.id("email");}
    private By Password_Input(){return By.id("passwd");}
    private By Submit_Login(){return By.id("SubmitLogin");}
    public static By InvalidEmailAddressMessage(){
        return By.xpath("//li[contains(text(),'Invalid email address.')]");
    }



    // Constructor
    public MyStore_SignUp_Page_2(WebDriver driver) {
        this.driver = driver;
    }


    public MyStore_SignUp_Page_2 typeValidNewEmail(String CurrentDateAndTime) {
        ElementActions.type(driver, email_TextBox(), "Test" + CurrentDateAndTime + "@Test.com");
        return this;
    }

    public MyStore_SignUp_Page_2 typeInValidEmail(String InvalidEmail) {
        ElementActions.type(driver, email_TextBox(),InvalidEmail );
        return this;
    }


    public MyStore_CreateAccount_Page_3 NavigateTo_CreateAccount_Page() {
        ElementActions.click(driver, submitCreate());
        return new MyStore_CreateAccount_Page_3(driver);
    }

    public MyStore_MyAccount_Page_4 ValidSignIn(String Email,String Password){
        ElementActions.type(driver,Email_Input(),Email);
        ElementActions.type(driver,Password_Input(),Password);
        ElementActions.click(driver,Submit_Login());
        return new MyStore_MyAccount_Page_4(driver);
    }

}
