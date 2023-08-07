package compareNavigation.buttons;

import locators.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ToKontakt {
    @Test
    public static void checkNavigateButton(WebDriver driver) {

        String winHandleBefore = driver.getWindowHandle();

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        Assert.assertEquals(Base.adressPage + "/de/kontakt/", driver.getCurrentUrl());

        driver.close();
        driver.switchTo().window(winHandleBefore);
    }

}
