package Gui.MyStore.pages.Order_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStore_Order_Page {
    WebDriver driver;

    private By Proceed_to_checkout_locator() {
        return By.xpath("(//a[@title='Proceed to checkout'])[2]");
    }

    private By quantity_locator() {
        return By.xpath("(//input[@type='text'])[2]");
    }

    /**
     * @return product total price
     */
    public static By total_price_locator() {
        return By.id("total_price");
    }

    public MyStore_Order_Page(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * @param quantity int value From OrderTestData(ByProduct.json)
     * @return product Quantity
     */
    public MyStore_Order_Page Change_the_quantity(int quantity) {
        ElementActions.type(driver, quantity_locator(), String.valueOf(quantity));
        ElementActions.waitForTextToChange(driver, total_price_locator(), "1", 1);
        return this;
    }


    /**
     * @return MyStore_OrderAddress_Page
     */
    public MyStore_OrderAddress_Page Click_On_Proceed_to_checkout_On_OrderPage() {
        ElementActions.click(driver, Proceed_to_checkout_locator());
        return new MyStore_OrderAddress_Page(driver);
    }

}
