package Gui.MyStore.pages.Register_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_SignUp_Page_2 {

    WebDriver driver;

    private By email_TextBox() {
        return By.id("email_create");
    }
    private By submitCreate() {
        return By.id("SubmitCreate");
    }
    private By Email_Input(){return By.id("email");}
    private By Password_Input(){return By.id("passwd");}
    private By Submit_Login(){return By.id("SubmitLogin");}

    /**
     *
     * @return Invalid Email Address Message locator
     */
    public static By InvalidEmailAddressMessage(){
        return By.xpath("//li[contains(text(),'Invalid email address.')]");
    }

    public MyStore_SignUp_Page_2(WebDriver driver) {
        this.driver = driver;
    }


    /**
     *
     * @param CurrentDateAndTime String Value From utils.Util.GenerateCurrentDateAndTime
     * @return type Valid New Email
     */
    public MyStore_SignUp_Page_2 typeValidNewEmail(String CurrentDateAndTime) {
        ElementActions.type(driver, email_TextBox(), "Test" + CurrentDateAndTime + "@Test.com");
        return this;
    }

    /**
     *
     * @param InvalidEmail String value  (type whatever you want)
     * @return type InValid Email
     */
    public MyStore_SignUp_Page_2 typeInValidEmail(String InvalidEmail) {
        ElementActions.type(driver, email_TextBox(),InvalidEmail );
        return this;
    }


    /**
     * @return MyStore_CreateAccount_Page_3
     */
    public MyStore_CreateAccount_Page_3 NavigateTo_CreateAccount_Page() {
        ElementActions.click(driver, submitCreate());
        return new MyStore_CreateAccount_Page_3(driver);
    }

    /**
     * @param Email String value From RegistrationData (LoginData.json)
     * @param Password String value From RegistrationData (LoginData.json)
     * @return Valid SignIn & navigate to MyStore_MyAccount_Page_4
     */
    public MyStore_MyAccount_Page_4 ValidSignIn(String Email,String Password){
        ElementActions.type(driver,Email_Input(),Email);
        ElementActions.type(driver,Password_Input(),Password);
        ElementActions.click(driver,Submit_Login());
        return new MyStore_MyAccount_Page_4(driver);
    }

}
