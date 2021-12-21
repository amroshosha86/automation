package demo.opencart;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFileUploadUsingRobot2 {
	public WebDriver driver ; 
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.navigate().to("https://kfictest.boardgulf.com/loginby/2");
		driver.manage().window().maximize();
	}


	@Test
	public void testFileUpload() throws InterruptedException, AWTException 

	{
		String imageName = "avatar-blank.jpg";
		String imagePath = System.getProperty("user.dir")+"\\Uploads\\"+imageName;
		System.out.println(System.getProperty("user.dir"));
		
		driver.navigate().to("https://kfictest.boardgulf.com/tasks/create");
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//input[@id='meetingToDate']")); 
		date.sendKeys("2022-11-05");
		WebElement selectuser = driver.findElement(By.cssSelector("ul[class='select2-selection__rendered']")); 
	
		Actions action=new Actions(driver);
		action.click(selectuser).click().build().perform();
		action.sendKeys("سهى هاشم الشيخ علي").build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys("تست تست تست تست تست").build().perform();
		
		WebElement fileUploader = driver.findElement(By.name("attachments[]")); 
		action.click(fileUploader).build().perform();
		
		Robot robot = new Robot();
		// CTRL + C copy image path
		StringSelection selection = new StringSelection(imagePath);
		System.out.println(imagePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		// Click on CTRL + V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		WebElement savebtn = driver.findElement(By.xpath("//button[@id='submit']")); 
		savebtn.click();
		
		WebElement message = driver.findElement(By.xpath("//h2[@id='swal2-title']")); 
		System.out.println(message.getText());
		Assert.assertTrue(message.getText().contains("بنجاح"));
			
		
		
		
		


	

		
	

	}
}
