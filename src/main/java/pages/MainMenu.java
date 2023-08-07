package pages;

import locators.FooterLocators;
import locators.MainMenuLocators;
import locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMenu {

    WebDriver driver;
    WebDriverWait wait;
    MainMenuLocators mainMenuLocators;
    public MainMenu(WebDriver driver){
        this.driver = driver;
        mainMenuLocators = new MainMenuLocators();
        PageFactory.initElements(driver, mainMenuLocators);
        wait = new WebDriverWait(driver, 5);
    }
    public void navigateToPortfolio(){
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuLocators.getPortfolio()));
        mainMenuLocators.getPortfolio().click();
    }

    public void navigateToBranchen(){
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuLocators.getBranchen()));
        mainMenuLocators.getBranchen().click();
    }
    public void navigateToQualityLearning(){
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuLocators.getQualityLearning()));
        mainMenuLocators.getQualityLearning().click();
    }
    public void navigateToMainLogo(){
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuLocators.getMainLogo()));
        mainMenuLocators.getMainLogo().click();
    }
    public void navigateToUberUns(){
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuLocators.getUberUns()));
        mainMenuLocators.getUberUns().click();
    }
    public void navigateToKarriere(){
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuLocators.getKarriere()));
        mainMenuLocators.getKarriere().click();
    }
    public void navigateToKontakt(){
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuLocators.getKontakt()));
        mainMenuLocators.getKontakt().click();
    }
    public void navigateToShop(){
        wait.until(ExpectedConditions.elementToBeClickable(mainMenuLocators.getShop()));
        mainMenuLocators.getShop().click();
    }

    public WebElement getCssToPortoflio(){return mainMenuLocators.getPortfolio(); }
    public WebElement getCssToBranchen(){return mainMenuLocators.getBranchen(); }
    public WebElement getCssToQualityLearning(){return mainMenuLocators.getQualityLearning(); }
    public WebElement getCssToUberUns(){return mainMenuLocators.getUberUns(); }
    public WebElement getCssToKarriere(){return mainMenuLocators.getKarriere(); }
    public WebElement getCssToKontakt(){return mainMenuLocators.getKontakt(); }
    public WebElement getCssToShop(){return mainMenuLocators.getShop(); }


}
