package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageWestHam extends TestBase {

    /*** repozytorium elementow ***/
    @FindBy(css = ".product_title.entry-title")
    WebElement productName;

    @FindBy(css = ".woocommerce-Price-amount.amount")
    WebElement productPrice;

    @FindBy(css = ".input-text.qty.text")
    WebElement productQuantity;

    @FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']")
    WebElement addToCartButton;

    @FindBy(xpath="//*[@class='woocommerce-message']")
    WebElement addToCartInfo;

    @FindBy(css=".button.wc-forward")
    WebElement checkCartButton;

    /*** konstruktor ***/
    public ProductPageWestHam(){
        PageFactory.initElements(driver,this);
    }

    /*** metody ***/
    public String getProductName(){
        String productNameText = productName.getText();
        return productNameText;
    }

    public String getPrice(){
        String price = productPrice.getText();
        return price;
    }

    public String getQuantity(){
        String quantity = productQuantity.getAttribute("value");
        return quantity;
    }

    public void addToCart(){
        addToCartButton.click();
    }

    public String addToCartInfoText(){
        return addToCartInfo.getText();
    }

    public CartPage goToCart(){
        checkCartButton.click();
        return new CartPage();
    }
}
