package annotationPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsClass {

	@BeforeClass
	public void openURL()
	{
		System.out.println("Open google url");
	}
	
	
	
	@AfterClass
	public void closeURL()
	{
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


	@Test(priority=100)
	public void deleteUser() {
		System.out.println("Delete user...");
	}
	
	@Test(priority=99)
	public void createUser() {
		System.out.println("Create new user...");
	}

}
