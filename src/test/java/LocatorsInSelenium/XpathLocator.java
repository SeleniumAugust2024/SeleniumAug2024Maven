package LocatorsInSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// XPath - Relative (//) and Absolute (/)
		// Relative - 
		// Absolute - Always from the root of /html/head/div/
		//   /html/body/div/div[2]/div[3]/div
		// Using tagname and attribute - 
		// 1. //tagname[@attribute = 'value']
		// 2. //*[contains(@attribute,'value']
		// 3. //*[@attribute='value' or @attribute='value']
		// 4. //*[@attribute='value' and @attribute='value']
		// 5. //tagname[starts-with(@attribute,'value')]
		// 6. //tagname[text() = 'value']
		// 7. XPATH AXES
		//  	- following, sibling
		// //*[@attribute='value']//following::tagname
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(10000);
		
		String profName = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).getText();
		
		System.out.println(profName);
		
		
	}
	

}
