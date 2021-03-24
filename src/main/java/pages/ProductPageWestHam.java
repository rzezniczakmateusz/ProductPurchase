package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageWestHam extends TestBase {

    /*** repozytorium elementow ***/
//    @FindBy(xpath="//h1[@class='product_title entry-title']")
    @FindBy(css = ".product_title.entry-title")
    WebElement productName;

    /*** konstruktor ***/
    public ProductPageWestHam(){
        PageFactory.initElements(driver,this);
    }

    /*** metody ***/
    public String getProductName(){
        String productNameText = productName.getText();
        return productNameText;
    }
}
