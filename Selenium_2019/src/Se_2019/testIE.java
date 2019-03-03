package Se_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testIE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "G:\\myGit\\Java-Selenium\\my_env\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.baidu.com");	
		driver.findElement(By.id("kw")).sendKeys("Selenium123");
		//driver.close();
	}
	
}
