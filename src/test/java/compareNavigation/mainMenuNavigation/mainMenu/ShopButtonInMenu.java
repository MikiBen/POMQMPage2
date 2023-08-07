package compareNavigation.mainMenuNavigation.mainMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ShopButtonInMenu {
    @Test
    public static void checkShopButtonInMenu(WebDriver driver) {

        String winHandleBefore = driver.getWindowHandle();

        try {
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }

            Assert.assertEquals("https://store.qualityminds.com/", driver.getCurrentUrl());
            driver.navigate().back();

            driver.close();
            driver.switchTo().window(winHandleBefore);

        } catch (Exception e) {
            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find shop button in menu");
            Assert.fail();
        }
    }
}
