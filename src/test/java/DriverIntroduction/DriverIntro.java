package DriverIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverIntro {

	
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","path");
		
	
	@Test
	void DemoDriver()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		//Method in Driver
		
		driver.manage().window().maximize(); // Maximise 
		
		String pageTitle = driver.getTitle(); // Capturing the title
		
		System.out.println("Page Title - "+ pageTitle);
		
		String pageUrl = driver.getCurrentUrl(); // Capturing the current URL
		
		System.out.println("Page URL - "+ pageUrl);
		
		driver.navigate().refresh(); // Reloading
		
		driver.navigate().to("https://demo.guru99.com/v4/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		//driver.quit(); //Quit all the associated window
		
		String pageSource = driver.getPageSource();
		
		System.out.println("Page Source - "+ pageSource);
		
		driver.close(); //Closing the current window
		//WebDriver driver1 = new EdgeDriver();
	}

}
