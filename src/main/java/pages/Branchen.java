package pages;

import locators.Base;
import locators.BranchenLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Branchen {
    WebDriver driver;
    WebDriverWait wait;
    BranchenLocators branchenLocators;
    public Branchen(WebDriver driver){
        this.driver = driver;
        branchenLocators = new BranchenLocators();
        PageFactory.initElements(driver, branchenLocators);
        wait = new WebDriverWait(driver, 5);
    }

    public void openBranchenPage(){driver.navigate().to(Base.adressPage + "/de/branchen/");    }
}


