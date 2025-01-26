package facades;

import Base.DriverManager;
import pages.*;
import pages.web.WebCartPage;
import pages.web.WebHomePage;

public class AddToCartFacade {

    public WebCartPage addToCart(String categoryName, int qty){
        WebHomePage homepage = new WebHomePage(DriverManager.getDriver());
        FilterSideBar filterBar = homepage.getFilterBar();
        filterBar.selectFilterCategory(categoryName);
        ProductDetailPage productDetailPage = homepage.selectProduct(1);
        productDetailPage.increaseProductQty(qty);
        productDetailPage.addToCart();
        return productDetailPage.goToCart();
    }

}
