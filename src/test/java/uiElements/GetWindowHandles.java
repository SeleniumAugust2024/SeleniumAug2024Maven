package uiElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		String windowId = driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("[onclick='myFunction()']")).click();
		
		Set<String> allWindowsId = driver.getWindowHandles();
		
		for(String windowHandle : allWindowsId)
		{
			if(!windowHandle.equals(windowId))
			{
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
		driver.switchTo().window(windowId);
		
		driver.findElement(By.id("name")).sendKeys("Akshay");
	}

	/*
	 * 
	 * APACHE POI 
	 * ----------
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
}
