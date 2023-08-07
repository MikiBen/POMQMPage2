package pages;

import locators.FooterLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footer {

    WebDriver driver;
    WebDriverWait wait;
    FooterLocators footerLocators;
    public Footer(WebDriver driver){
        this.driver = driver;
        footerLocators = new FooterLocators();
        PageFactory.initElements(driver, footerLocators);
        wait = new WebDriverWait(driver, 10);
    }

    public void navigateToMainLogo() {
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getQualityMindsLogo()));
        footerLocators.getQualityMindsLogo().click();
    }
    public void navigateToImpressum(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getImpressum()));
        footerLocators.getImpressum().click();
    }
    public void navigateToHinwesgebersystem(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getHinwesgebersystem()));
        footerLocators.getHinwesgebersystem().click();
    }
    public void navigateToDatenschutzerklarung(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getDatenschutzerklarung()));
        footerLocators.getDatenschutzerklarung().click();
    }
    public void navigateToKontakt(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getKontakt()));
        footerLocators.getKontakt().click();
    }

    public void navigateToTwitter(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getTwitter()));
        footerLocators.getTwitter().click();
    }
    public void navigateToLinkedIn(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getLinkedIn()));
        footerLocators.getLinkedIn().click();
    }
    public void navigateToFacebook(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getFacebook()));
        footerLocators.getFacebook().click();
    }
    public void navigateToXing(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getXing()));
        footerLocators.getXing().click();
    }
    public void navigateToFeed(){
        wait.until(ExpectedConditions.elementToBeClickable(footerLocators.getFeed()));
        footerLocators.getFeed().click();
    }

    public WebElement getCssToImpressum(){return footerLocators.getImpressum(); }
    public WebElement getCssToHinwesgebersystem(){return footerLocators.getHinwesgebersystem(); }
    public WebElement getCssToDatenschutzerklarung(){return footerLocators.getDatenschutzerklarung(); }
    public WebElement getCssToKontakt(){return footerLocators.getKontakt(); }


}
