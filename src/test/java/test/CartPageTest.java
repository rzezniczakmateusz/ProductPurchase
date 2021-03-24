package test;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPageWestHam;

public class CartPageTest extends TestBase {
    CartPage cartPage;
    HomePage homePage;
    ProductPageWestHam productPageWestHam;

    public CartPageTest() {
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization();
        cartPage = new CartPage();
        homePage = new HomePage();
        productPageWestHam = new ProductPageWestHam();
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

    @Test
    public void checkShippingMethod(){
        homePage.clickOnTshirt();
        productPageWestHam.addToCart();
        productPageWestHam.goToCart();

        Assert.assertEquals(driver.getTitle(),"Koszyk – Selenium Shop Automatyzacja Testów");
        Assert.assertTrue(cartPage.isFreeShippingChecked().isSelected());

        takeScreenShot("CartPage");
    }

}
