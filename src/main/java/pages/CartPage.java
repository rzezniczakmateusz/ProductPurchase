package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends TestBase {

    @FindBy(xpath = "//input[@value='free_shipping:2']")
    WebElement freeShipping;

    public CartPage() {
        PageFactory.initElements(driver,this);
    }

    public WebElement isFreeShippingChecked(){
        return freeShipping;
    }

}
