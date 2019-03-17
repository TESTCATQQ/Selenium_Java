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
		//写信
		driver.findElement(By.id("composebtn")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.name("mainFrame")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.name("subject")).sendKeys("name");
		Thread.sleep(2000);
		driver.findElement(By.id("subject")).sendKeys("name");
		//上传
		driver.findElement(By.name("UploadFile")).sendKeys("G:\\ISTQB\\ISTQB认证初级大纲.pdf");
		
		//取消frame
		driver.switchTo().defaultContent();
		driver.findElement(By.id("readmailbtn_link")).click();
		
		//driver.switchTo().frame(driver.findElement(By.id("leftFrame")));
		//driver.findElement(By.id("composeExitAlert_QMDialog_btn_delete_save")).click();
	}
}
