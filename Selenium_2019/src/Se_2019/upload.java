package Se_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\myGit\\\\Selenium_Java\\\\my_env\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.qq.com/");
		//frame
		driver.switchTo().frame(driver.findElement(By.id("login_frame")));
		driver.findElement(By.id("u")).sendKeys("376456272");
		driver.findElement(By.id("p")).sendKeys("WLzjj520!");
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("pp")).sendKeys("376456272");
		driver.findElement(By.name("btlogin")).click();
		Thread.sleep(2000);
		//п╢пе
		driver.findElement(By.id("composebtn")).click();
	}
}
