package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    /*** repozytorium elementów ***/
//    @FindBy(xpath = "//a[contains(text(),'Koszulka West Ham United')]")
//    WebElement westHamTshirt;

    /*** konstruktor ***/
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    /*** metody ***/
    public ProductPageWestHam clickOnTshirt(){
        WebElement westHamTshirt = driver.findElement(By.xpath("//a[contains(text(),'Koszulka West Ham United')]"));
        westHamTshirt.click();
        return new ProductPageWestHam(driver);
    }

}
