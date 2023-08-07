package compareNavigation.footerNavigation.footer;

import locators.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KontaktInFooter {

    @Test
    public static void checkNavigateLink(WebDriver driver, WebElement webElement) {

        try {
            Assert.assertEquals(Base.adressPage + "/de/kontakt/", driver.getCurrentUrl());
            Assert.assertEquals("normal", webElement.getCssValue("font-style"));
            Assert.assertEquals("normal", webElement.getCssValue("font-variant"));
            Assert.assertEquals("\"Source Sans Pro\", sans-serif", webElement.getCssValue("font-family"));
            driver.navigate().back();
        }catch (Exception e) {

            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find KontaktDE button in Footer");
            Assert.fail();

        }
    }
}
