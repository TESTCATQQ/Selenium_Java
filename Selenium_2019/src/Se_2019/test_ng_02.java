package Se_2019;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test_ng_02 {
	WebDriver driver = null;
	
	@BeforeTest
	public void bef() {
		System.out.println("BeforeTest");
		System.setProperty("webdriver.chrome.driver", "G:\\\\myGit\\\\Selenium_Java\\\\my_env\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test_02() {
		driver.get("http://www.baidu.com");
		driver.findElement(By.linkText("ÐÂÎÅ")).click();
		System.out.println(driver.getCurrentUrl());
		
		Assert.assertEquals(driver.getCurrentUrl().contains("news"),true, "news.equal");
	}
	
	@AfterTest
	public void aft() {
		driver.quit();
		System.out.println("AfterTest");
	}
	

}
