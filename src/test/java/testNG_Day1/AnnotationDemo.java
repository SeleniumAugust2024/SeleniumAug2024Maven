package testNG_Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
	//@BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod, @Test, @AfterMethod
	//@AfterClass, @AfterTest, @AfterSuite

	@BeforeSuite
	public void beforeSuiteDemo()
	{
		System.out.println("I am in Before Suite");
	}
	
	@AfterSuite
	public void afterSuiteDemo()
	{
		//Closing the Driver  - driver.close();
		System.out.println("I am in after Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I am in beforeTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("I am in afterTest");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I am in beforeClass");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("I am in afterClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I am in beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I am in afterMethod");
	}
	
	@Test
	public void testDemo1()
	{
		System.out.println("I am in Test Demo 1");
		AnnotationDemo.testDemo2();

	}
	
	public static void testDemo2()
	{
		System.out.println("I am in Test Demo 2");

	}
//Before Suite>Before Test>Before Class>Before Method> Test >After Method>After Class>After Test>After SUite	
}

