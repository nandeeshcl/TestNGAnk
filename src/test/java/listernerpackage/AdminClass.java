package listernerpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AdminClass {
	
	
	@BeforeSuite
	public void beforeSUite()
	{
		System.out.println("Before suite");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}
	
	
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	
	
	@Test
	public void adminRegister()
	{
		//Assert.assertTrue(false);
		System.out.println("Admin registered");
	}

}
