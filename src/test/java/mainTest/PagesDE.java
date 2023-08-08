package mainTest;

import compareNavigation.buttons.ToKontakt;
import compareNavigation.buttons.ToNewsBlog;
import compareNavigation.buttons.ToUberUns;
import compareNavigation.footerNavigation.FooterDe;
import compareNavigation.mainMenuNavigation.CheckMainMenuDE;
import file.JsonFile;
import locators.Base;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Branchen;
import pages.MainPage;
import pages.Portfolio;

import java.io.IOException;

public class PagesDE {

    private static WebDriver driver;
    private static JsonFile jsonFile = new JsonFile();

    @Before
    public  void setUp() throws IOException {
        jsonFile.readFile();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        //options.addArguments("--headless");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to(Base.adressPage + "/de/");

        WebElement acceptCookies = driver.findElement(By.xpath("//*[@id=\"cmplz-cookiebanner-container\"]/div/div[6]/button[1]"));
        acceptCookies.click();

    }

    @Test
    public void mainPageTest(){
        MainPage mainPage = new MainPage(driver);

        try {
            mainPage.openMainPage();

            mainPage.navigateToUberUns();
            ToUberUns.checkNavigateButton(driver);

            mainPage.navigateToNewsBlog();
            ToNewsBlog.checkNavigateButton(driver);

            mainPage.navigateToKontakt();
            ToKontakt.checkNavigateButton(driver);

        }catch(Exception e) {

            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find proper container");
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    @Test
    public void portfolioPageTest(){
        Portfolio portfolio   = new Portfolio(driver);

        try {
            portfolio.openPortfolioPage();
            FooterDe.checkFooter(driver);
        }catch(Exception e) {

            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find proper container");
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    @Test
    public void branchenPageTest(){
        Branchen branchen = new Branchen(driver);

        try {
            branchen.openBranchenPage();
            FooterDe.checkFooter(driver);
        }catch(Exception e) {
            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find proper container");
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    @Test
    public void checkFooterDE(){

        try {
            for(int i=1;i< jsonFile.getPages().getUrlModelList().size(); i++ )
            {
                driver.navigate().to(Base.adressPage + jsonFile.getPages().getUrlModelList().get(i).getUrl());
                FooterDe.checkFooter(driver);
            }
        }catch(Exception e) {
            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find proper container in footer");
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    @Test
    public void checkMainMenuDE() {

        try {
            for(int i=1;i< jsonFile.getPages().getUrlModelList().size(); i++ )
            {
                driver.navigate().to(Base.adressPage + jsonFile.getPages().getUrlModelList().get(i).getUrl());
                CheckMainMenuDE.checkMainMenu(driver);

            }
        }catch(Exception e) {
            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find proper container in mainMenu");
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    @Test
    public void checkTabNameDE(){
        try {
            for(int i=0;i< jsonFile.getPages().getUrlModelList().size(); i++ )
            {
                driver.navigate().to(Base.adressPage + jsonFile.getPages().getUrlModelList().get(i).getUrl());
                Assert.assertEquals(jsonFile.getPages().getUrlModelList().get(i).getTabName(), driver.getTitle());
            }
        }catch(Exception e) {
            System.out.println("On page: " + driver.getCurrentUrl() + " I can not find proper container in mainMenu");
            System.out.println(e.getMessage());
            Assert.fail();
        }
    }

    @After
    public void closeBrowser() {

        driver.quit();
    }

}



