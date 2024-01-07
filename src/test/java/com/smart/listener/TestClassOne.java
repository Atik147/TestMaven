package com.smart.listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerImplementationClass.class)
public class TestClassOne {
	
	
	@Test (priority = 1)
	
	public void testMethod11() {
		System.out.println("I am inside testMethod1");
	}
	@Test (priority = 2)
	
	public void testMethod12() {
		System.out.println("I am inside testMethod2");
		Assert.fail();
	
	}	
	@Test (priority = 3)
	public void testMethod13() throws InterruptedException {
		Thread.sleep(2000);
		
		System.out.println("I am inside testMethod3");

	}
	@Test (priority = 4)
	public void testMethod14() {
		System.out.println("I am inside testMethod4");
	}
	@Test (priority = 5)
	public void testMethod5() {
		System.out.println("I am inside testMethod5");
	}
	@Test (priority = 6)
	public void testMethod16() {
		System.out.println("I am inside testMethod6");
	}
	@Test (priority = 7)
	public void testMethod17() {
		System.out.println("I am inside testMethod7");
	}
	

}
