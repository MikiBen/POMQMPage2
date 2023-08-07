package compareNavigation.mainMenuNavigation.mainMenu;

import locators.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FontInMainMenu {
    @Test
    public static void checkFontInMainMenu(WebDriver driver, WebElement webElement) {

        try {
            Assert.assertEquals("normal", webElement.getCssValue("font-style"));
            Assert.assertEquals("normal", webElement.getCssValue("font-variant"));
            Assert.assertEquals("\"Source Sans Pro\", sans-serif", webElement.getCssValue("font-family"));
            Assert.assertEquals("16px", webElement.getCssValue("font-size"));

        } catch (Exception e) {

            System.out.println("On page: " + driver.getCurrentUrl() + " is wrong font on main menu");
            Assert.fail();

        }

    }
}
