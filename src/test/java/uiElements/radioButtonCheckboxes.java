package uiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement radioButton = driver.findElement(By.cssSelector("[type='radio']"));
		
		if(radioButton.isSelected())
		{
			System.out.println("It is selected");
		}
		else
		{
			radioButton.click();
		}
		
		WebElement checkBoxS = driver.findElement(By.cssSelector("[id='sunday']"));
		
		checkBoxS.click();
		
		driver.findElement(By.cssSelector("[id='monday']")).click();
		
		//driver.quit();
		
		
	}

}
