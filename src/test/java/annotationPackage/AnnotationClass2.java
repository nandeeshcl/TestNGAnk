package annotationPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass2 {
	
	@BeforeTest
	public void openChrome()
	{
		System.out.println("OPen CHrome driver");
	}
	
	
	@AfterTest
	public void closeChrome()
	{
		System.out.println("CLose CHrome driver");
	}
	
	@Test
	public void userProfile()
	{
		System.out.println("User Profile");
	}
	
	@BeforeSuite
	public void setup()
	{
		
		System.out.println("Setup method");
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("TearDown method");
	}

}
