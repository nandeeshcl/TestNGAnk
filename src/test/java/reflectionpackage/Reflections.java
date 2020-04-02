package reflectionpackage;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Reflections {

	@BeforeMethod
	public void beforeMethod(Method m) {
		System.out.println(m.getName() + " " + "started execution");

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		System.out.println(result.getName() + " " + "finished execution");
		//System.out.println("Status is : " + result.getStatus());
		
		if(result.getStatus()==1)
		{
			System.out.println("Test case PASSED");
		}
		else
		{
			System.out.println("Test case FAILED");
		}
	}

	@Test
	public void userCreate() {
		Assert.assertTrue(true);
		System.out.println("User create");
	}

	@Test
	public void userDelete() {
		Assert.assertTrue(true);
		System.out.println("User create");
	}

}
