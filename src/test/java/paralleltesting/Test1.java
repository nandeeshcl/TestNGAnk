package paralleltesting;

import java.util.Date;

import org.testng.annotations.Test;

public class Test1 {

	Date d = new Date();

	@Test
	public void login() throws InterruptedException {

		System.out.println("Login to app at time: " + d);
		Thread.sleep(50000);
		
	}

	@Test
	public void register() throws InterruptedException {
		System.out.println("Register user at time: "+d);
		
	}

}
