package Se_2019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\myGit\\Selenium_Java\\my_env\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		//driver.manage().window().maximize();//最大化
		//driver.findElement(By.id("kw")).sendKeys("testId");//By.id
		//driver.findElement(By.name("wd")).sendKeys("name");//By.name
		//driver.findElement(By.className("s_ipt")).sendKeys("classname");//by.classname
		//driver.findElement(By.linkText("学术")).click();//By。linktext
		//driver.findElement(By.partialLinkText("新")).click();//与linktext类似，但只需要包含，即可访问
		//System.out.println(driver.findElements(By.tagName("input")).size());//by tagname
		//driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("Xpath");//by Xpath
		//driver.findElement(By.cssSelector("#kw")).sendKeys("cssSelector");//cssSelector
		//System.out.println(driver.findElement(By.id("kw")).getAttribute("class"));
		//System.out.println(driver.findElement(By.id("kw")).getAttribute("maxlength"));
		
		/*driver.findElement(By.id("kw")).sendKeys("test1");
		Thread.sleep(1000);
		driver.findElement(By.id("kw")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("kw")).sendKeys("test2");
		Thread.sleep(1000);*/
		
		//System.out.println(driver.findElement(By.id("kw")).isDisplayed());
		//System.out.println(driver.findElement(By.linkText("新闻")).getText());
		//System.out.println(driver.findElement(By.id("kw")).isSelected());
		/*
		driver.findElement(By.id("kw")).sendKeys("王琳同学");
		//driver.findElement(By.id("kw")).submit();
		driver.findElement(By.id("su")).click();*/
		
		//System.out.println(driver.getWindowHandle());//获取打开浏览器字符串？
		driver.findElement(By.id("kw")).sendKeys("王琳同学");
		driver.findElement(By.id("su")).click();
		System.out.println(driver.getCurrentUrl());
		
	}
}
