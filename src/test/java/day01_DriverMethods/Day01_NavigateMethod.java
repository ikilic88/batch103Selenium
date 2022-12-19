package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com");
        // Techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("http://Techproeducation.com");
        // Tekrar Amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();
        // Tekrar Hepsiburada sayfasna gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        // son sayfada sayfayı yıneleyelım
        Thread.sleep(3000);
        driver.navigate().refresh();
        // ve sayfayı kapatalım
        driver.close();
    }
}
        //Youtube ana sayfasina gidelim . https://www.youtube.com/
            //Amazon soyfasina gidelim. https://www.amazon.com/
            //Tekrar YouTube’sayfasina donelim
        //Yeniden Amazon sayfasina gidelim
        //Sayfayi Refresh(yenile) yapalim
        //Sayfayi kapatalim / Tum sayfalari kapatalim