package pages.factory;

import org.openqa.selenium.WebDriver;
import pages.interfaces.CartPage;
import pages.interfaces.HomePage;
import pages.mweb.MWebCartPage;
import pages.mweb.MWebHomePage;

public class MWebPOFactory extends POFactory{
    @Override
    public HomePage getHomepage(WebDriver driver) {
        return new MWebHomePage(driver);
    }

    @Override
    public CartPage getCartPage(WebDriver driver) {
        return new MWebCartPage(driver);
    }
}
