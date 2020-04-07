package listernerpackage;

import org.testng.IExecutionListener;

/*
 * 
Test Class---user
onStart

    

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

public class Listener implements ITestListener, IExecutionListener {

	public void onExecutionStart() {
		System.out.println("Suite started");
	}

	public void onStart(ITestContext context) {

		System.out.println("Test Class Started");

	}

	public void onTestStart(ITestResult result) {

		System.out.println("Test Case Start");

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test Case Sucess");

	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Test Case Failure");

	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test Case Skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onFinish(ITestContext context) {

		System.out.println("Test class ended");

	}

	public void onExecutionFinish() {
		System.out.println("Suite finished");
	}

}
