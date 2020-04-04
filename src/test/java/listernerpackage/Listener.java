package listernerpackage;


/*
 * 
Test Class---user
onStart

    @BF---chromeLaunch

    onTestStart
    @Test---login
          Pass  ---onTestSuccess
          Fail  ---onTestFailure
          Skipp ---OnTestSkipped


    onTestStart               
    @Test ---register
          Pass  ---onTestSuccess
          Fail  ---onTestFailure
          Skipp ---OnTestSkipped

onFinish
*/


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Case Start");

		//System.out.println("Test method: " + result.getName()+ " started execution");

	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Case Sucess");

		//System.out.println("Success of test cases and its details are : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Test Case Failure");
		//System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test Case Skipped");
		//System.out.println("Skip of test cases and its details are : " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		//System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	public void onStart(ITestContext context) {

		
		System.out.println("Test Class Started");
		//System.out.println("Test started");

	}

	public void onFinish(ITestContext context) {

		System.out.println("Test class ended");
		//System.out.println("Test ended");

	}
	

}
