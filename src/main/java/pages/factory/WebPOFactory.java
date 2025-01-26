package pages.factory;

import org.openqa.selenium.WebDriver;
import pages.interfaces.CartPage;
import pages.interfaces.HomePage;
import pages.web.WebCartPage;
import pages.web.WebHomePage;

public class WebPOFactory extends POFactory{
    @Override
    public HomePage getHomepage(WebDriver driver) {
        return new WebHomePage(driver);
    }

    @Override
    public CartPage getCartPage(WebDriver driver) {
        return new WebCartPage(driver);
    }
}
