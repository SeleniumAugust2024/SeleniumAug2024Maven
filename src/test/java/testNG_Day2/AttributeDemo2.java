package testNG_Day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AttributeDemo2 {

	
	@Test (description = "This is for login into the application")
	void Demo()
	{
		System.out.println("Description Demo");
	}
	
	@Test(expectedExceptions= {ArrayIndexOutOfBoundsException.class})
	void Demo1()
	{
		int m[] = {2,3,4};
		System.out.println(m[5]);
		System.out.println(1/0);
		System.out.println("HELLO WOLRD");
	}
	
	@DataProvider(name = "TestData")
	public Object[][] DataProvideDemo()
	{
		return new Object[][] {
			{"abd","xyz","xmx"},
			{"abc","pqr", "dsn"},
			{"abcd","pqrs", "dsn"}
		};
	}
	
	@Test(dataProvider="TestData",dataProviderClass=AttributeDemo.class)
	void TestDP(String user, String pass, String data)
	{
		System.out.println("Username : "+ user + " Password: "+ pass + " Data: "+ data);
	}
	
	@Test(groups= {"Smoke"})
	void SmokeGroup2()
	{
		System.out.println("I am in Smoke Group 2");
	}
	
}
