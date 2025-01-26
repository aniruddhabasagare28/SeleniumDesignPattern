package tests;

import Base.BaseTest;
import Base.DriverManager;
import facades.AddToCartFacade;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.web.WebCartPage;
import pages.FilterSideBar;
import pages.web.WebHomePage;
import pages.ProductDetailPage;

public class CartTests extends BaseTest {

    @Test
    public void testCartHammers(){
        WebHomePage homepage = new WebHomePage(DriverManager.getDriver());
        FilterSideBar filterBar = homepage.getFilterBar();
        filterBar.selectFilterCategory("Hammer");
        ProductDetailPage productDetailPage = homepage.selectProduct(1);
        productDetailPage.increaseProductQty(2);
        productDetailPage.addToCart();
        WebCartPage cartPage = productDetailPage.goToCart();
        //Assertions
    }

    @Test
    public void testCartPliers(){
        WebHomePage homepage = new WebHomePage(DriverManager.getDriver());
        FilterSideBar filterBar = homepage.getFilterBar();
        filterBar.selectFilterCategory("Pliers");
        ProductDetailPage productDetailPage = homepage.selectProduct(1);
        productDetailPage.increaseProductQty(1);
        productDetailPage.addToCart();
        WebCartPage cartPage = productDetailPage.goToCart();
        //Assertions
    }

    @Test
    public void testCartHammersFacade(){
        AddToCartFacade addToCartFacade= new AddToCartFacade();
        WebCartPage cartPage = addToCartFacade.addToCart("Hammer", 2);

        //Assertions
        Assert.assertTrue(cartPage.isProceedPresent());
        Assert.assertTrue(cartPage.getProductName().contains("Hammer"));
    }
}
