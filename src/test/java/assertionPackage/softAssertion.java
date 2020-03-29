package assertionPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {

	@Test(priority = 1)
	public void sum() {

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(20,21,"Values not matched");

		soft.assertFalse(true,"asdadsad");

		System.out.println("Assertion1 completed");
		
		soft.assertAll();
	}

	/*
	 * @Test(priority=2) public void sum2() {
	 * 
	 * Assert.assertEquals(20, 21, "Values not matched");
	 * 
	 * Assert.assertTrue(true);
	 * 
	 * System.out.println("Assertion2 completed"); }
	 */

}
