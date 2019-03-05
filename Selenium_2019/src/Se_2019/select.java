package Se_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class select {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\myGit\\Selenium_Java\\my_env\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText("设置"))).perform();
		driver.findElement(By.className("setpref")).click();
		Thread.sleep(5000);
		
		Select se = new Select(driver.findElement(By.name("NR")));
		//se.selectByIndex(1);//选择“每页显示20条”
		//se.selectByValue("50");
		//se.selectByVisibleText("每页显示50条");//按文本信息选择
		
		//se.getOptions().get(1).click();//选择"每页显示20条"
		//System.out.println(se.getOptions().size());
		for(int i=0;i<se.getOptions().size();i++) {
			se.getOptions().get(i).click();
			Thread.sleep(3000);
		}
	}
}
