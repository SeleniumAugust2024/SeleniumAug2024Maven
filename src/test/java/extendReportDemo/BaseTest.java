package extendReportDemo;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {

	
	ExtentSparkReporter extendSparkReporter;
	ExtentReports extendReports;
	ExtentTest extentTest;
	
	
	@BeforeTest
	void startReporter()
	{
		extendSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/extendReport.html");
		extendReports = new ExtentReports();
		extendReports.attachReporter(extendSparkReporter);
		
		extendSparkReporter.config().setDocumentTitle("Automation Report");
		extendSparkReporter.config().setReportName("Test Report");
		extendSparkReporter.config().setTheme(Theme.DARK);
		extendSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(Status.FAIL, result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			extentTest.log(Status.PASS, result.getThrowable());
		}
		else {
			extentTest.log(Status.SKIP,result.getThrowable());
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		extendReports.flush();
	}
	
}
