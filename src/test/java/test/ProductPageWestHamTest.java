package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import base.*;

public class ProductPageWestHamTest extends TestBase {

    HomePage homePage;
    ProductPageWestHam productPageWestHam;

    public ProductPageWestHamTest() {
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
        homePage = new HomePage();
        productPageWestHam = new ProductPageWestHam();
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

    @Test
    public void checkProductName(){
        homePage.clickOnTshirt();

        Assert.assertEquals(driver.getTitle(),"Koszulka West Ham United – Selenium Shop Automatyzacja Testów");
        Assert.assertTrue(productPageWestHam.getProductName().equalsIgnoreCase("Koszulka West Ham United"));
        Assert.assertEquals(productPageWestHam.getPrice(),"90,00 ZŁ");
        Assert.assertEquals(productPageWestHam.getQuantity(),"1");

        productPageWestHam.addToCart();
        System.out.println(productPageWestHam.addToCartInfoText());

        productPageWestHam.goToCart();

        takeScreenShot("WestHamTshirtPage");
    }
}
