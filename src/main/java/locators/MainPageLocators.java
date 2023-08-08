package locators;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MainPageLocators {

    @FindBy(xpath="//*[@id=\"post-18582\"]/div/div/div/div[5]/div[2]/div/div[2]/a")
    private WebElement toNewsBlog;

    @FindBy(xpath = "//*[@id=\"store-butt\"]/a")
    private WebElement shopButton;

    @FindBy(xpath ="//*[@id=\"post-18582\"]/div/div/div/div[8]/div/div[1]/div[2]/a")
    private WebElement toKontakt;

    @FindBy(xpath="//*[@id=\"post-18582\"]/div/div/div/div[4]/div[2]/div[1]/div[2]/a")
    private WebElement toUberUns;

}

