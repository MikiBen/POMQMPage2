package compareNavigation.footerNavigation.footer;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FeedInFooter {
    @Test
    public static void checkFeedInFooter(WebDriver driver) {

        String winHandleBefore = driver.getWindowHandle();

        try {
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }

            Assert.assertEquals("https://qualityminds.com/de/feed/", driver.getCurrentUrl());
            driver.navigate().back();

            driver.close();
            driver.switchTo().window(winHandleBefore);

        } catch (Exception e) {
            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find Feed button in Footer");
            Assert.fail();
        }
    }
}
