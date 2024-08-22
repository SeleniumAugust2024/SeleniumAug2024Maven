package testNG_Day2;

import org.testng.annotations.Test;

public class GroupDemo {

	@Test(groups= {"Sanity"})
	void SanityGroup()
	{
		System.out.println("I am in Sanity Group");
	}
	
	@Test(groups= {"Regression"})
	void RegressionGroup()
	{
		System.out.println("I am in Regression Group");

	}
	
	@Test(groups= {"Smoke"})
	void SmokeGroup1()
	{
		System.out.println("I am in Smoke Group 1");
	}
	
	@Test(groups= {"Smoke"})
	void SmokeGroup2()
	{
		System.out.println("I am in Smoke Group 2");
	}

}

