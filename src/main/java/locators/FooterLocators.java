package locators;


import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
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

}
