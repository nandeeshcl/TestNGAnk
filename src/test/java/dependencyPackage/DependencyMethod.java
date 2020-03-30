package dependencyPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {

	@Test
	public void register() {
		Assert.assertTrue(false);
		System.out.println("Register new user");
	}

	@Test(dependsOnMethods = { "register" })
	public void login() {
		//Assert.assertTrue(false);
		System.out.println("Login to application");
	}

	@Test(dependsOnMethods = { "login" ,"register" })
	public void createUser() {
		System.out.println("To create new User");
	}

}
