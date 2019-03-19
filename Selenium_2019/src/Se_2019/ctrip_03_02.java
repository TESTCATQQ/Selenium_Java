package Se_2019;
/*
 * Ctrip¶©Æ±
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ctrip_03_02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\myGit\\\\Selenium_Java\\\\my_env\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trains.ctrip.com/TrainBooking/SearchTrain.aspx###");
		driver.findElement(By.cssSelector("#notice01")).sendKeys("ÉÏº£");
		driver.findElement(By.cssSelector("#notice08")).sendKeys("º¼ÖÝ");
		
		driver.findElement(By.cssSelector("#searchtype > li.current")).click();
		driver.findElement(By.cssSelector("#searchbtn")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#tbody-01-K18050 > div.railway_list > div.w6 > div:nth-child(2) > a")).click();
		
		
	}
}
