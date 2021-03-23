package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageWestHam extends TestBase {

    /*** repozytorium elementow ***/
//    @FindBy(className = "product_title entry-title")
//    WebElement productName;

    /*** konstruktor ***/
    public ProductPageWestHam(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /*** metody ***/
    public String getProductName(){
        WebElement productName = driver.findElement(By.xpath("//h1[@class='product_title entry-title']"));
        String productNameText = productName.getText();
        return productNameText;
    }
}
