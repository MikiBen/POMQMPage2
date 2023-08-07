package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuLocators {

    @FindBy(xpath="//*[@id=\"top-menu\"]/li[1]/a")
    private WebElement portfolio;

    @FindBy(xpath="//*[@id=\"top-menu\"]/li[2]/a")
    private WebElement branchen;

    @FindBy(xpath="//*[@id=\"top-menu\"]/li[3]/a")
    private WebElement qualityLearning;

    @FindBy(xpath="//*[@id=\"top-menu\"]/li[5]/div/a")
    private WebElement mainLogo;

    @FindBy(xpath="//*[@id=\"top-menu\"]/li[4]/a")
    private WebElement uberUns;

    @FindBy(xpath="//*[@id=\"top-menu\"]/li[6]/a")
    private WebElement karriere;

    @FindBy(xpath="//*[@id=\"top-menu\"]/li[7]/a")
    private WebElement kontakt;

    @FindBy(xpath="//*[@id=\"store-butt\"]/a")
    private WebElement shop;

    public WebElement getPortfolio() {
        return portfolio;
    }

    public WebElement getBranchen() {
        return branchen;
    }

    public WebElement getQualityLearning() {
        return qualityLearning;
    }

    public WebElement getMainLogo() {
        return mainLogo;
    }

    public WebElement getUberUns() {return uberUns;}

    public WebElement getKarriere() {
        return karriere;
    }

    public WebElement getKontakt() {
        return kontakt;
    }

    public WebElement getShop() {
        return shop;
    }


}
