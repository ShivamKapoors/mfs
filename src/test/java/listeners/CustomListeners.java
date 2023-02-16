package listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import baseclass.Baseclass;
import utilities.TestUtil;

public class CustomListeners extends Baseclass implements ITestListener{
	
	public 	String messageBody;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	public void onTestFailure(ITestResult arg0)
	{
		System.setProperty("org.uncommons.reportng.escape-output","false");
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with exception : "+arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\"+TestUtil.screenshotName));
		rep.endTest(test);
		rep.flush();
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href="+System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\"+TestUtil.screenshotName+">Screenshot</a>");
		Reporter.log("<a target=\"_blank\" href="+System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\"+TestUtil.screenshotName+"><img src="+System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\"+TestUtil.screenshotName+TestUtil.screenshotName+" height=200 width=200></img></a>");
		Reporter.log("<br>");
		

	}

	public void onTestSkipped(ITestResult arg0) {


		
	}


	public void onTestStart(ITestResult arg0) 
	{
		test = rep.startTest(arg0.getName().toUpperCase());
		System.out.println("The onTestStart: "+test);
	
	}

	public void onTestSuccess(ITestResult arg0) {
		Reporter.log("The testcase has been executed successfully");
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+" PASS");
		rep.endTest(test);
		rep.flush();
		System.out.println("The onTestSuccess are :"+test);
		
	}

	public void onFinish(ISuite arg0) {
		
		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

}
