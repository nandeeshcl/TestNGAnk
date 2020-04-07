package listernerpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tags {

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
		System.out.println("Logout from the application");
	}

	@Test
	public void userProfile1() {
		System.out.println("User Profile1");
	}
	
	@Test
	public void userProfile2() {
		System.out.println("User Profile2");
	}
	

}
