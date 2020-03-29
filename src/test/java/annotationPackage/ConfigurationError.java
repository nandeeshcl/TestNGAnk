package annotationPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationError {

	@BeforeSuite
	public void setup() {

		
		System.out.println("Setup method");
	}

	@AfterSuite
	public void tearDown() {
		
		
		System.out.println("TearDown method");
	}

	@BeforeTest
	public void openChrome() {
		
		
		System.out.println("OPen CHrome driver");
	}

	@AfterTest
	public void closeChrome() {
		System.out.println("CLose CHrome driver");
	}

	@BeforeClass
	public void openURL() {
		
		
		System.out.println("Open google url");
	}

	@AfterClass
	public void closeURL() {
		System.out.println("Close google URL");
	}

	@BeforeMethod
	public void login() {
		
		
		System.out.println("Login to the application");
	}

	@AfterMethod
	public void logout() {
		
		//Assert.assertTrue(false);
		System.out.println("Logout from the application");
	}

	@Test
	public void userProfile() {
		
		
		System.out.println("User Profile");
	}
	
	@Test(enabled=false)
	public void createUser() {
		
		
		System.out.println("New User created");
	}
	

}
