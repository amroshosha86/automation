package demo.opencart;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForTest {
	public WebDriver driver ; 
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.navigate().to("https://demo.opencart.com/index.php?route=common/home");
		driver.manage().window().maximize();
	}


	@Test
	public void testFileUpload() throws InterruptedException, AWTException 

	{

		WebElement myaccountlink = driver.findElement(By.cssSelector("a[title='My Account']"));
		myaccountlink.click();
			
		WebElement registerlink = driver.findElement(By.linkText("Register"));
		registerlink.click();


	
		
	
		
		


	

		
	

	}
}
