package test;

import org.openqa.selenium.WebDriver;
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
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

    @Test
    public void checkProductName(){
        homePage = new HomePage();
        productPageWestHam = new ProductPageWestHam();

        homePage.clickOnTshirt();
        System.out.println(driver.getTitle());
        System.out.println(productPageWestHam.getProductName());

        takeScreenShot("WestHamTshirtPage");
    }
}
