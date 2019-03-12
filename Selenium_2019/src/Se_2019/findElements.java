package Se_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class findElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\myGit\\Selenium_Java\\my_env\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.baidu.com");
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText("…Ë÷√"))).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.className("setpref")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElements(By.tagName("input")).size());
		System.out.println(driver.findElements(By.name("SL")).size());
		for(int i=0;i<driver.findElements(By.name("SL")).size();i++) {
			driver.findElements(By.name("SL")).get(i).click();
			Thread.sleep(2000);
			System.out.println(driver.findElements(By.name("SL")).get(i).getAttribute("id"));
		}
	}
}
