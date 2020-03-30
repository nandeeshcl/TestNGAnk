package dependencyPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups= {"Smoke","Sanity"})
	public void register() {
		Assert.assertTrue(false);
		System.out.println("Register new user");
	}

	@Test(groups= {"Smoke"})
	public void login() {
		//Assert.assertTrue(false);
		System.out.println("Login to application");
	}

	@Test(dependsOnGroups= {"Smoke","Sanity"},groups= {"Regression"})
	public void createUser() {
		System.out.println("To create new User");
	}
	

}
