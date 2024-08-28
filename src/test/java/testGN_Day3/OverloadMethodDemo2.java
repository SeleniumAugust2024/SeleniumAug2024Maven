package testGN_Day3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OverloadMethodDemo2 {

	@Parameters({"demoname"})
	@Test	
	public void normalMethod(String n)
	{
		System.out.println("I am in first class");
		System.out.println(n);
	}
	

	@Parameters({"demoname", "age"})
	@Test	
	public void normalMethod(String n, int a)
	{
		System.out.println("I am in second class");
		System.out.println(n);
		System.out.println(a);


	}
}
