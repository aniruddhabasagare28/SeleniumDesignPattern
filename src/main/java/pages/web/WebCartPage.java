package pages.web;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.interfaces.CartPage;

public class WebCartPage extends BasePage implements CartPage {

    By qty = By.cssSelector("[class*='quantity']");
    By productName=By.cssSelector("[class*='product-title']");
    By proceedBtnCss =By.cssSelector("[data-test*='proceed']");
    By removeProductBtnCss =By.cssSelector("[class*='btn-danger']");

    public WebCartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){
        return getText(productName);
    }

    public String getProductQty(){
        return getValue(qty);
    }

    public boolean isProceedPresent(){
        return isDisplayed(proceedBtnCss);
    }

    public void removeProduct(){
        waitAndClick(removeProductBtnCss);
        waitForInVisible(removeProductBtnCss);
    }

}
