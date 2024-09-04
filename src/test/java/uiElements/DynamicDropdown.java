package uiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='input-items from_flights show active']//div[@class='mt-2 show active']")).click();
		
	
		driver.findElement(By.cssSelector("[type='search']")).sendKeys("BLR");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("[class='select2-results__option select2-results__option--highlighted']")).click();
		
	}
	

}
