package Gui.MyStore.pages.Order_Pages;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_OrderPayment_Page {
    WebDriver driver;

    private By Pay_by_check() {
        return By.xpath("//a[@title='Pay by check.']");
    }

    public MyStore_OrderPayment_Page(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @return MyStore_OrderSummary_Page
     */
    public MyStore_OrderSummary_Page Click_On_Pay_by_check() {
        ElementActions.click(driver,Pay_by_check());
        return new MyStore_OrderSummary_Page(driver);
    }

}
