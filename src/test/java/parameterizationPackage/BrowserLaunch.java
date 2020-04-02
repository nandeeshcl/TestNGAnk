package parameterizationPackage;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class BrowserLaunch {

	@Parameters("br")
	
	 public void launchBrowser(String b) throws InterruptedException {

		Date d = new Date();

		if (b.equals("chrome")) {

			System.out.println("Launch chrome browser" + d);
			Thread.sleep(2000);
		}

		else if (b.equals("firefox")) {
			System.out.println("Launch firefox browser" + d);
			Thread.sleep(2000);
		}

		else if (b.equals("IE")) {
			System.out.println("Launch IE browser" + d);
			Thread.sleep(2000);
		}
	}

}
