package compareNavigation.footerNavigation.footer;

import locators.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MainLogoInFooter {

    @Test
    public static void checkMainLogoInFooter(WebDriver driver) {

        try {
            Assert.assertEquals(Base.adressPage + "/de/", driver.getCurrentUrl());
            driver.navigate().back();
        } catch (Exception e) {

            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find MainPage button in Footer");
            Assert.fail();

        }
    }
}
