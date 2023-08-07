package pages;

import locators.Base;
import locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    WebDriver driver;
    WebDriverWait wait;
    MainPageLocators mainPageLocators;
    public MainPage(WebDriver driver){
        this.driver = driver;
        mainPageLocators = new MainPageLocators();
        PageFactory.initElements(driver, mainPageLocators);
        wait = new WebDriverWait(driver, 5);
    }

    public void openMainPage(){driver.navigate().to(Base.adressPage + "/de/");    }
    public void navigateToShop(){
        wait.until(ExpectedConditions.elementToBeClickable(mainPageLocators.getShopButton()));
        mainPageLocators.getShopButton().click();
    }
    public void navigateToNewsBlog(){
        wait.until(ExpectedConditions.elementToBeClickable(mainPageLocators.getToNewsBlog()));
        mainPageLocators.getToNewsBlog().click();
    }
    public void navigateToUberUns(){
        wait.until(ExpectedConditions.elementToBeClickable(mainPageLocators.getToUberUns()));
        mainPageLocators.getToUberUns().click();
    }
    public void navigateToKontakt(){
        wait.until(ExpectedConditions.elementToBeClickable(mainPageLocators.getToKontakt()));
        mainPageLocators.getToKontakt().click();
    }

}