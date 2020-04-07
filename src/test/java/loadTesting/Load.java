package loadTesting;

import org.testng.annotations.Test;

public class Load {
	
	@Test(invocationCount=5,threadPoolSize=4)
	public void login()
	{
		System.out.println("Login");
	}

}
