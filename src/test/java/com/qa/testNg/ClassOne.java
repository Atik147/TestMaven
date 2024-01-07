package com.qa.testNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne {
	
	@Test
	
	public void googleTest() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ProSmart", Keys.ENTER);
		String actualTitle = driver.getTitle();
		String expectedTitle = "ProSmart - Google Searchhhhhhhhhh";
 //   	Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title did not match >> ");
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
