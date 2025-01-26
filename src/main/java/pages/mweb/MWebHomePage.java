package pages.mweb;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.interfaces.HomePage;
import pages.web.WebHomePage;

public class MWebHomePage extends WebHomePage implements HomePage {
    By hambergurMenu = By.cssSelector("[class='navbar-toggler-icon']");

    public MWebHomePage(WebDriver driver) {
        super(driver);
    }

    public void toggleMenu(){
        waitAndClick(hambergurMenu);
    }

    public void openCategories(){
        toggleMenu();
        super.openCategories();
    }


}
