package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLocators {

    @FindBy(xpath="//*[@id=\"et-main-area\"]/footer/div/div/div[1]/div/div[1]/a")
    private WebElement qualityMindsLogo;

    @FindBy(xpath = "//*[@id=\"menu-item-17644\"]/a")
    private WebElement impressum;

    @FindBy(xpath = "//*[@id=\"menu-item-38208\"]/a")
    private WebElement  hinwesgebersystem;

    @FindBy(xpath = "//*[@id=\"menu-item-17643\"]/a")
    private WebElement datenschutzerklarung;

    @FindBy (xpath = "//*[@id=\"menu-item-21489\"]/a")
    private WebElement kontakt;

    @FindBy (xpath = "//*[@id=\"et-main-area\"]/footer/div/div/div[1]/div/ul/li[1]/a")
    private WebElement twitter;

    @FindBy (xpath = "//*[@id=\"et-main-area\"]/footer/div/div/div[1]/div/ul/li[2]/a")
    private WebElement linkedIn;

    @FindBy (xpath = "//*[@id=\"et-main-area\"]/footer/div/div/div[1]/div/ul/li[3]/a")
    private WebElement facebook;

    @FindBy (xpath = "//*[@id=\"et-main-area\"]/footer/div/div/div[1]/div/ul/li[4]/a")
    private WebElement xing;

    @FindBy (xpath = "//*[@id=\"et-main-area\"]/footer/div/div/div[1]/div/ul/li[5]/a")
    private WebElement feed;

    public WebElement getTwitter() {
        return twitter;
    }

    public void setTwitter(WebElement twitter) {
        this.twitter = twitter;
    }

    public WebElement getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(WebElement linkedIn) {
        this.linkedIn = linkedIn;
    }

    public WebElement getFacebook() {
        return facebook;
    }

    public void setFacebook(WebElement facebook) {
        this.facebook = facebook;
    }

    public WebElement getXing() {
        return xing;
    }

    public void setXing(WebElement xing) {
        this.xing = xing;
    }

    public WebElement getFeed() {
        return feed;
    }

    public void setFeed(WebElement feed) {
        this.feed = feed;
    }

    public WebElement getQualityMindsLogo() {
        return qualityMindsLogo;
    }

    public void setQualityMindsLogo(WebElement qualityMindsLogo) {
        this.qualityMindsLogo = qualityMindsLogo;
    }

    public WebElement getImpressum() {
        return impressum;
    }

    public void setImpressum(WebElement impressum) {
        this.impressum = impressum;
    }

    public WebElement getHinwesgebersystem() {
        return hinwesgebersystem;
    }

    public void setHinwesgebersystem(WebElement hinwesgebersystem) {
        this.hinwesgebersystem = hinwesgebersystem;
    }

    public WebElement getDatenschutzerklarung() {
        return datenschutzerklarung;
    }

    public void setDatenschutzerklarung(WebElement datenschutzerklarung) {
        this.datenschutzerklarung = datenschutzerklarung;
    }

    public WebElement getKontakt() {
        return kontakt;
    }

    public void setKontakt(WebElement kontakt) {
        this.kontakt = kontakt;
    }




}
