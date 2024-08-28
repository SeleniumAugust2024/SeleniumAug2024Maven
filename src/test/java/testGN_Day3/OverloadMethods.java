package testGN_Day3;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class OverloadMethods {

	
	@Test(dataProvider = "Demodata")
	public void normalMethod(String n)
	{
		System.out.println("I am in first class");
	}
	

	@Test(dataProvider = "Demodata1")
	public void normalMethod(String n, int a)
	{
		System.out.println(n);
		System.out.println("I am in second class");

	}
	
	@DataProvider(name = "Demodata")
	public static Object[][] dataProviderMethod()
	{
		return new Object[][] {{"QATesting"}};
		
	}
	
	@DataProvider(name = "Demodata1")
	public static Object[][] dataProviderMethod1()
	{
		return new Object[][] {{"QATesting",34},{"Java",345}};		
	}
	
	
	//		return new Object[][] {{"QATesting",34}};

}

