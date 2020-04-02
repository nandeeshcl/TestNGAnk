package dataProviderPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass1 {
	
	
	@Test(dataProvider="testData",dataProviderClass=DataClass.class)
	public void login(String email,String password)
	{
		System.out.println("Login started");
		System.out.println("Email is: "+email);
		System.out.println("Password is: "+password);
		System.out.println("Login ended");
		
	}

	
}
