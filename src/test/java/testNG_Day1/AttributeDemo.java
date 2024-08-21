package testNG_Day1;

import org.testng.annotations.Test;

public class AttributeDemo {

	@Test(priority = -1)
	void priorityDemo1() {
		System.out.println("I am Priority 1");
	}

	@Test(priority = -23)
	void priorityDemo2() {
		System.out.println("I am Priority 2");
	}

	@Test(priority = 3)
	void priorityDemo3() {
		System.out.println("I am Priority 3");
	}
	
	@Test
	void AriorityDemo1()
	{
		System.out.println("I am AriorityDemo1");
	}
	
	@Test
	void AaiorityDemo1()
	{
		System.out.println("I am AaiorityDemo1");
	}
	
	

}
