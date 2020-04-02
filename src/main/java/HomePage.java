import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    public void tapMobily() {
        WebElement mobily = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/div[1]/div[2]/div[1]/div/a"));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mobily.click();
    }
    public void tapKarta() {
        WebElement karta = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/div[1]/div[1]"));
        karta.click();
    }
    public void tapNejdrazsi() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement nejdrazsi = driver.findElement(By.xpath("//*[@id=\"navigation-container\"]/div/ul[1]/li[3]/a"));
        nejdrazsi.click();
    }
}