package Se_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xuanting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\myGit\\Selenium_Java\\my_env\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		//driver.findElement(By.id("kw")).sendKeys("Õı¡’");
		//driver.findElement(By.id("su")).click();
		//System.out.println(driver.getCurrentUrl());
		
		Actions action = new Actions(driver);
		//action.clickAndHold(driver.findElement(By.className("pf"))).perform();
		action.clickAndHold(driver.findElement(By.linkText("…Ë÷√"))).perform();//…Ë÷√
		Thread.sleep(5000);
		driver.findElement(By.className("setpref")).click();
	}
}