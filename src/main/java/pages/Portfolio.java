package pages;

import locators.Base;
import locators.MainPageLocators;
import locators.PortfolioPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Portfolio {

    WebDriver driver;
    WebDriverWait wait;
    PortfolioPageLocators portfolioPageLocators;
    public Portfolio(WebDriver driver){
        this.driver = driver;
        portfolioPageLocators = new PortfolioPageLocators();
        PageFactory.initElements(driver, portfolioPageLocators);
        wait = new WebDriverWait(driver, 5);
    }

    public void openPortfolioPage(){driver.navigate().to(Base.adressPage + "/de/qm-portfolio/");    }
}
