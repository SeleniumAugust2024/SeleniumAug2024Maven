package DriverIntroduction;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implicit Wait
		//Explicit Wait
		//Fluent Wait
		
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/v1/");
		
		//Explicit Wait
		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("ss")));
		
		//Fluent Wait
		
		FluentWait<WebDriver> wait1 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		WebElement demo1  = wait1.until(new Function<>(){
			public WebElement demo(WebDriver driver)
			{
				return driver.findElement();
			}
		});
		
		Thread.sleep(1000);
		
		wait1.until(ExpectedConditions.alertIsPresent());
	}

}
