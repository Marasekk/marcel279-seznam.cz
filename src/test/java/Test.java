import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

    @org.junit.Test
    public void czc() {
      WebDriver driver = BasePage.startBrowser("chrome", "https://czc.cz");

      DesiredCapabilities capabilities = new DesiredCapabilities();

      String URL = driver.getCurrentUrl();
      Assert.assertEquals(URL, "https://www.czc.cz/" );

      HomePage homePage = new HomePage();
      homePage.tapKarta();
      homePage.tapMobily();

      URL = driver.getCurrentUrl();
      Assert.assertEquals(URL, "https://www.czc.cz/mobilni-telefony/produkty" );

      homePage.tapNejdrazsi();

      MobilyPage mobilyPage = new MobilyPage();
      mobilyPage.tapMobil1();
      mobilyPage.tapContinue();
      mobilyPage.tapMobil2();
    }
}