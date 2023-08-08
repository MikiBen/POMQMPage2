package compareNavigation.buttons;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class ShopButton {

    @Test
    public static void checkShopButton(WebDriver driver) {

            String winHandleBefore = driver.getWindowHandle();

            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Assert.assertEquals("https://store.qualityminds.com/", driver.getCurrentUrl());

            driver.close(); //This was added
            driver.switchTo().window(winHandleBefore);

    }
}
