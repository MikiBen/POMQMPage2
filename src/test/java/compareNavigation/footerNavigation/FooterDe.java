package compareNavigation.footerNavigation;

import compareNavigation.footerNavigation.footer.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.Footer;

public class FooterDe {

    @Test
    public static void checkFooter(WebDriver driver) {

        Footer footer = new Footer(driver);

        footer.navigateToMainLogo();
        MainLogoInFooter.checkMainLogoInFooter(driver);

        footer.navigateToImpressum();
        ImpressumFooter.checkImpessumInFooter(driver, footer.getCssToImpressum());

        footer.navigateToHinwesgebersystem();
        HinwesgebersystemInFooter.checkHinwesgebersystemInFooter(driver, footer.getCssToHinwesgebersystem());

        footer.navigateToDatenschutzerklarung();
        DatenschutzerklarungInFooter.checkNavigateLink(driver, footer.getCssToDatenschutzerklarung());

        footer.navigateToKontakt();
        KontaktInFooter.checkNavigateLink(driver, footer.getCssToKontakt());

        footer.navigateToTwitter();
        TwitterInFooter.checkTwitterInFooter(driver);

        footer.navigateToLinkedIn();
        LinkedInFooter.checkLinkedInFooter(driver);

        footer.navigateToFacebook();
        FacebookInFooter.checkFacebookInFooter(driver);

        footer.navigateToXing();
        XingInFooter.checkXingInFooter(driver);

        footer.navigateToFeed();
        FeedInFooter.checkFeedInFooter(driver);

    }
}
