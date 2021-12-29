package Gui.MyStore.tests;

import Gui.MyStore.pages.Product_Pages.MyStore_Searched_Page;
import Gui.MyStore.pages.Register_Pages.MyStore_SignIn_Page_1;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Validations;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Epic("My Store")
@Feature("GUI")
public class Gui_Search_Product_Test {
   private WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();
    }

    @Description("Given the browser is open, When i navigate to My Store URl, And Move cursor over women link, And click on T-Shirt Tab ,And Search using product name," +
            "Then the same product is displayed on searched page with same details which were displayed on T-Shirt's page  ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("search product")
    @Test(description = "search product")
    public void search_Product() {
        new MyStore_SignIn_Page_1(driver)
                .navigateToURL()
                .Move_cursor_over_Women_link()
                .Click_on_Tshirt_Tab()
                .Get_Product_Name_Then_Search_Using_Product_Name();

        Validations.assertThat().element(driver, MyStore_Searched_Page.Searched_Product_Name())
                .text()
                .isEqualTo("Faded Short Sleeve T-shirts")
                .withCustomReportMessage("Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page")
                .perform();

    }

    @AfterMethod
    public void afterMethod(){
        BrowserActions.closeCurrentWindow(driver);
    }
}
