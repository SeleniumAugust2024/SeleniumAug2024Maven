package testGN_Day3;

import org.testng.annotations.Test;

public class TestNGOverloadDemo {

	
	@Test
	public void normalMethod()
	{
		System.out.println("This is first normal method");
	}
	
	@Test
	public void normalMethod(String n)
	{
		System.out.println("This is second overloaded");
	}
}
