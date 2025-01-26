package pages.mweb;

import org.openqa.selenium.WebDriver;
import pages.web.WebCartPage;

public class MWebCartPage extends WebCartPage implements pages.interfaces.CartPage {
    public MWebCartPage(WebDriver driver) {
        super(driver);
    }
}
