package pages.factory;

import org.openqa.selenium.WebDriver;
import pages.interfaces.CartPage;
import pages.interfaces.HomePage;
import utilities.PropertyHandler;

public abstract class POFactory {
    public abstract HomePage getHomepage(WebDriver driver);
    public abstract CartPage getCartPage(WebDriver driver);

    public static POFactory getFactory(){
        POFactory poFactory;
        switch (PropertyHandler.platform){
            case "mweb": poFactory = new MWebPOFactory();break;
            case "web": poFactory = new WebPOFactory();break;
            default: throw new IllegalArgumentException("Not a valid platform"+PropertyHandler.platform);
        }
        return poFactory;
    }

}
