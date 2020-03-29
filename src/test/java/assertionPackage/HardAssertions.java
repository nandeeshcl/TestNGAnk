package assertionPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test(priority=1)
	public void sum() {

		Assert.assertEquals(20, 21, "Values not matched");
		Assert.assertTrue(false);

		System.out.println("Assertion1 completed");
	}

	@Test(priority=2)
	public void sum2() {

		Assert.assertEquals(20, 21, "Values not matched");

		Assert.assertTrue(true);

		System.out.println("Assertion2 completed");
	}

}
