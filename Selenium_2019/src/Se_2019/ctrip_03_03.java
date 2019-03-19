package Se_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ctrip_03_03 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\myGit\\\\Selenium_Java\\\\my_env\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://passport.ctrip.com/user/login?");
		driver.findElement(By.cssSelector("#nloginname")).sendKeys("18818227098");
		driver.findElement(By.cssSelector("#npwd")).sendKeys("Error");
		Thread.sleep(2000);
		
		WebElement sour = driver.findElement(By.cssSelector("#sliderddnormal > div.cpt-drop-box > div.cpt-drop-btn > div > i.cpt-logo.cpt-img-double-right"));
		WebElement ele = driver.findElement(By.cssSelector("#sliderddnormal > div.cpt-drop-box > div.cpt-bg-bar"));
		//ele.getSize().getWidth();
		//ele.getSize().getHeight();
		Actions action = new Actions(driver);
		action.dragAndDropBy(sour, ele.getSize().getWidth(), ele.getSize().getHeight()).perform();
	}
}
