package compareNavigation.footerNavigation.footer;

import locators.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TwitterInFooter {
    @Test
    public static void checkTwitterInFooter(WebDriver driver) {

        String winHandleBefore = driver.getWindowHandle();
        try {
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            Assert.assertEquals("https://twitter.com/qualitymindsde", driver.getCurrentUrl());
            driver.navigate().back();

            driver.close();
            driver.switchTo().window(winHandleBefore);
            
        } catch (Exception e) {

            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find Twitter button in Footer");
            Assert.fail();

        }
    }
}
