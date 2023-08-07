package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageLocators {
    //wszystkie lokatory

    @FindBy(xpath="//*[@id=\"post-18582\"]/div/div/div/div[5]/div[2]/div/div[2]/a")
    private WebElement toNewsBlog;

    public WebElement getToNewsBlog() {
        return toNewsBlog;
    }

    public void setToNewsBlog(WebElement toNewsBlog) {
        this.toNewsBlog = toNewsBlog;
    }

    @FindBy(xpath = "//*[@id=\"store-butt\"]/a")
    private WebElement shopButton;

    public WebElement getShopButton() {
        return shopButton;
    }

    public void setShopButton(WebElement shopButton) {
        this.shopButton = shopButton;
    }

    @FindBy(xpath ="//*[@id=\"post-18582\"]/div/div/div/div[8]/div/div[1]/div[2]/a")
    private WebElement toKontakt;

    public WebElement getToKontakt() {
        return toKontakt;
    }

    public void setToKontakt(WebElement toKontakt) {
        this.toKontakt = toKontakt;
    }

    @FindBy(xpath="//*[@id=\"post-18582\"]/div/div/div/div[4]/div[2]/div[1]/div[2]/a")
    private WebElement toUberUns;

    public WebElement getToUberUns() {
        return toUberUns;
    }

    public void setToUberUns(WebElement toUberUns) {
        this.toUberUns = toUberUns;
    }
}

