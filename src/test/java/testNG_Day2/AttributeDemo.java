package testNG_Day2;

import org.testng.annotations.Test;

public class AttributeDemo {

	@Test(invocationCount=5)
	void invocationCountDemo()
	{
		System.out.println("Invocation Count Demo");
	}
	
	@Test(enabled=true)
	void enabledDemo()
	{
		System.out.println("Enabled Demo");

	}
	
	@Test(timeOut = 10)
	void timeoutDemo() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Timeout Demo");
	}
	
	@Test(alwaysRun=true)
	void alwayRunDemo()
	{
		System.out.println("Always Run Demo");
	}
	
	@Test(dependsOnMethods= {"GroupDemo2","GroupDemo1"})
	void dependOnMethodDemo()
	{
		System.out.println("Demo for Depends on method");
	}
	
	@Test
	void GroupDemo1()
	{
		System.out.println("Group Demo 1");
	}
	
	@Test
	void GroupDemo2()
	{
		System.out.println("Group Demo 2");
	}
	
	@Test(groups= {"Smoke"})
	void SmokeGroup2()
	{
		System.out.println("I am in Smoke Group 2");
	}
}
