package extendReportDemo;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestExtentReportBasic extends BaseTest{
	

	@Test
	public void testPassed()
	{
		extentTest = extendReports.createTest("Test Case 1", "This Test Cases is Passed");
		Assert.assertTrue(true);
	}
	

	@Test
	public void testFailed()
	{
		extentTest = extendReports.createTest("Test Case 2", "This Test Cases is Failed");
		Assert.assertTrue(false);
	}
	

	@Test
	public void testSkipped()
	{
		extentTest = extendReports.createTest("Test Case 3", "This Test Cases is Skipped");
		throw new SkipException("The Test Cases Has Been Skipped");
	}
}
