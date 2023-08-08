package locators;


import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
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

}
