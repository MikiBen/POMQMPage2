package compareNavigation.mainMenuNavigation.mainMenu;

import locators.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MainLogoInMenu {
    @Test
    public static void checkMainLogoInMenu(WebDriver driver) {

        try {
            Assert.assertEquals(Base.adressPage + "/de/", driver.getCurrentUrl());
            driver.navigate().back();
        } catch (Exception e) {

            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find MainPage button in Menu");
            Assert.fail();

        }
    }
}
