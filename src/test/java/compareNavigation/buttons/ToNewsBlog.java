package compareNavigation.buttons;

import locators.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ToNewsBlog {
    @Test
    public static void checkNavigateButton(WebDriver driver) {

            Assert.assertEquals( Base.adressPage + "/de/uber-uns/news-blog/", driver.getCurrentUrl());
            driver.navigate().back();
    }
}
