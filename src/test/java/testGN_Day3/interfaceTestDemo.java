package testGN_Day3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public interface interfaceTestDemo {

	
	
	@BeforeTest
	public static void beforeTestDemo()
	{
		System.out.println("I am in before Test");
	}
	
	@Test
	default void staticMethod()
	{
		System.out.println("I am in static Method");
	}
}
