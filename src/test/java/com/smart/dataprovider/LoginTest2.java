package com.smart.dataprovider;


import org.testng.annotations.Test;

public class LoginTest2 {

	@Test (dataProvider = "loginData" , dataProviderClass = ExcelDataSupplier.class)
	
	public void testLogin(String name, String pass) {
		System.out.println(name + "logged in to the application with" + pass);
		
		
		package session12;

		import org.testng.annotations.Test;

		public class TestExcelDataProvider {
			
			@Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupplier.class)
			public void loginTest(String name, String pass) {
				System.out.println(name + " logged in to the application with " + pass);
			}
		}

	
		
		
		
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//String actualmessage = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		//String expectedmessange="Dashboard";
		//SoftAssert soft = new SoftAssert();
		//soft.assertEquals(actualmessage, expectedmessange,"login did not verify");
		//soft.assertAll();
		//driver.quit();


		
	}

}
