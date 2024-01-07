package xom.smart.parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest {
	WebDriver driver;
	
	
	public static SoftAssert soft = new SoftAssert();;
	
	
	@Parameters("browserName")
	
	
	@BeforeTest
	public void initializeBrowser(String browserName) {
		
		switch (browserName.toLowerCase()) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("This browser is not supported.");
			
		}
		driver.manage().window().maximize();
		
		
	}
	
	@AfterTest
	public void tearDown() {
		soft.assertAll();
		driver.quit();
}
	
@Test
public void launchApplication11() {
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}	
	
@Test
public void loginTotheApplication() {
		
		
		driver.findElement(By.xpath("//input[@name='usename']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
			
}
@Test
public void validateLogin() {
	String actual = driver.findElement(By.xpath("//p[text(='paul Collings']")).getText();
	String expected = "Paul Collings";
	soft.assertEquals(actual, expected,"Invalid credentials >> ");
}

@Test
public void navigateToMyInfo() {
		driver.findElement(By.xpath("//span[text()= 'My Info']")).click();
		
}	

@Test
public void veifyingMyInfo() {
	
boolean actualStatus = driver.findElement(By.xpath("//h6[text(='Personal Details']")).isDisplayed();
soft.assertTrue(actualStatus);

}




}
