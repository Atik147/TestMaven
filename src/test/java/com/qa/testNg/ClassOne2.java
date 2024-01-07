package com.qa.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne2 {
	
	@Test
	
	public void googleTest() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ProSmart", Keys.ENTER);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
			
		
	}
	
	@Test
	public void facebook() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("ProSmart", Keys.ENTER);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}
	
	
	

}
