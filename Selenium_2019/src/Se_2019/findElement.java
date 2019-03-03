package Se_2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\myGit\\Java-Selenium\\my_env\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
	}
}
