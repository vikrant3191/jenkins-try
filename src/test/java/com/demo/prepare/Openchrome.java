package com.demo.prepare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openchrome {

	public static WebDriver driver;
	
	@Test
	public static void browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium-jar-file\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("dropdown-class-example")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
