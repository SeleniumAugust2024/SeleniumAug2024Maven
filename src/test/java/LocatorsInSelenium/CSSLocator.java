package LocatorsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSSLocator {

	WebDriver driver;
	@BeforeTest
	void invokeBrowserAndLogin() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test //CSS
	void addProductAndCheckout()
	{
		//Find the CSS Locator
		//Rules
		//Approach 1 - tagname[attribute='value']
		//Approach 2 - [attribute='value]
		//Approach 3 - if you are aware about id and classname
				//   - #id - valid css
				//   - .classname - (if there is empty space please remove and add .) - valid css
		//Approach 4 - tagname#id
				//   - tagname.classname
		//Approach 5 - Traverse - parentTag > childTag > grandchildTag
	
		
		//Plugin - SelectorHub - https://chromewebstore.google.com/detail/selectorshub-xpath-helper/ndgimibanhlabgdgjcpbbndiehljcpfh?pli=1
		
		//Plugin - ChroPath - https://chromewebstore.google.com/detail/chropath/ljngjbnaijcbncmcnjfhigebomdlkcjo?scrollchropath=true
		
		List<WebElement> ele = driver.findElements(By.cssSelector(".btn_primary.btn_inventory"));
		
		ele.get(0).click();
		
		driver.findElement(By.cssSelector("#shopping_cart_container")).click();
		
		driver.findElement(By.cssSelector(".btn_action.checkout_button")).click();
		
		String expValue = driver.findElement(By.cssSelector(".subheader")).getText();
		
		//String actValue = "Checkout: Your Information";
		
		Assert.assertTrue(expValue.equals("Checkout: Your Information"));
		
		//Assert.assertTrue(TRUE)
		
		//Assert.assertFalse(FALSE)
		
		driver.findElement(By.cssSelector("#first-name")).sendKeys("Selenium");
		
		driver.findElement(By.cssSelector("#last-name")).sendKeys("Java");
		
		driver.findElement(By.cssSelector("#postal-code")).sendKeys("12342");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		driver.findElement(By.cssSelector("[href='./checkout-complete.html']")).click();
		
		String finalmsg = driver.findElement(By.cssSelector(".complete-header")).getText();
		
		String expfinalmsg = "THANK YOU FOR YOUR ORDER";
		
		Assert.assertEquals(finalmsg, expfinalmsg);
		
		
	}
}
