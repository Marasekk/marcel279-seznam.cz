import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class MobilyPage extends BasePage {

    private boolean check = false;

    public void tapMobil1() {
        while (!check)
            {
            try {
                WebElement mobil1 = driver.findElement(By.xpath("//*[@id='tiles']/div[1]/div[1]/div[2]/div[2]/button"));
                mobil1.click();
                check = true;
            }
            catch (NoSuchElementException e) {
                System.out.println("Element \"mobil1\" Not Found");}

            catch (Exception e){}
            }
        check = false;
    }
    public void tapMobil2() {
        while (!check)
        {
            try {
                WebElement mobil2 = driver.findElement(By.xpath("//*[@id='tiles']/div[1]/div[2]/div[2]/div[2]/button"));
                //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                mobil2.click();
                check = true;
            }
            catch (NoSuchElementException e) {
                System.out.println("Element \"mobil2\" Not Found");
            }
            catch (Exception e){}
        }
        check = false;
    }

    public void tapContinue() {
        while (!check)
        {
            try {
                WebElement tapContinue = driver.findElement(By.xpath("//*[@id='buy-mode-product']/div[2]/button/span/span"));
                tapContinue.click();
                check = true;
            }
            catch (NoSuchElementException e) {
                System.out.println("Element \"pokracovat\" Not Found");}
            catch (Exception e){}
        }
        check = false;
    }
}







