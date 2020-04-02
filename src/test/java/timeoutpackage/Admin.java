package timeoutpackage;

import org.testng.annotations.Test;

public class Admin {
	
	@Test
	void test1() throws InterruptedException
	{
		Thread.sleep(7000);
		System.out.println("Test Admin1");
	}
	
	@Test
	void test3() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test Admin2");
	}
	
	@Test
	void test4() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test Admin3");
	}
	
	
	

}
