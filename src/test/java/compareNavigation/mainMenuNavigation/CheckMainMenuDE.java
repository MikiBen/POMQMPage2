package compareNavigation.mainMenuNavigation;

import compareNavigation.mainMenuNavigation.mainMenu.FontInMainMenu;
import compareNavigation.mainMenuNavigation.mainMenu.MainLogoInMenu;
import compareNavigation.mainMenuNavigation.mainMenu.ShopButtonInMenu;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainMenu;

public class CheckMainMenuDE {


    @Test
    public static void checkMainMenu(WebDriver driver) {


        MainMenu mainMenu = new MainMenu(driver);

        FontInMainMenu.checkFontInMainMenu(driver, mainMenu.getCssToPortoflio());
        FontInMainMenu.checkFontInMainMenu(driver, mainMenu.getCssToBranchen());
        FontInMainMenu.checkFontInMainMenu(driver, mainMenu.getCssToQualityLearning());
        FontInMainMenu.checkFontInMainMenu(driver, mainMenu.getCssToUberUns());
        FontInMainMenu.checkFontInMainMenu(driver, mainMenu.getCssToKarriere());
        FontInMainMenu.checkFontInMainMenu(driver, mainMenu.getCssToKontakt());
        FontInMainMenu.checkFontInMainMenu(driver, mainMenu.getCssToShop());

        mainMenu.navigateToMainLogo();
        MainLogoInMenu.checkMainLogoInMenu(driver);

        mainMenu.navigateToShop();
        ShopButtonInMenu.checkShopButtonInMenu(driver);

    }
}
