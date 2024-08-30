package DriverIntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 8
		// css, xpath, id, linktext, name, class, partialtext, TagName
		
		//ID and Name
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		
		
		/*<input type="text" class="form_input" data-test="username" 
				id="user-name" placeholder="Username" 
				autocorrect="off" autocapitalize="none" value="standard_user">*/
		
		//CSS, XPATH -- ids
	}

}
