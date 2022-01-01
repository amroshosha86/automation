package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		//open google search engine
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//implicitlyWait "wait until page to load"
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Search for "weather"
		WebElement SearchInput=driver.findElement(By.name("q"));
		SearchInput.sendKeys("weather"+ Keys.ENTER);
		
		//Explicit wait
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Weatherlink=wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("weather")));
		Weatherlink.click();
		
		//RelativeLocators
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement LoginButton=driver.findElement(By.id("btnLogin"));
		
		WebElement PasswordInput=
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(LoginButton));
		PasswordInput.sendKeys("123");
		
		//Thread.sleep(2000);
		//driver.quit();
	
	}


}
