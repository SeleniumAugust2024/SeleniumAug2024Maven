package uiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Select
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		Select passDropdown = new Select(driver.findElement(By.name("passCount")));
		
		passDropdown.selectByVisibleText("4");
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		Thread.sleep(5000);
		
		Select multiSelect = new Select(driver.findElement(By.id("fruits")));
		
		multiSelect.selectByValue("banana");
		multiSelect.selectByValue("apple");
		
		
	}

}
