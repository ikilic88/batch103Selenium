package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com/");

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com/");

        //Tekrar YouTube’sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();

        //Yeniden Amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

         //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();
    }
}
