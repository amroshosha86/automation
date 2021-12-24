package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));


		WebElement LoginText=driver.findElement(By.cssSelector("#logInPanelHeading"));
				
		WebElement LoginInput=
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(LoginText));
		LoginInput.sendKeys("admin");
		
		WebElement LoginButton=driver.findElement(By.id("btnLogin"));

		WebElement PasswordInput=
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(LoginButton));
		PasswordInput.sendKeys("123");
		
		Thread.sleep(2000);
		driver.quit();
	
	}


}
