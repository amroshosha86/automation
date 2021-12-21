package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.applitools.eyes.serializers.WebElementSerializer;

public class ElementsPage extends PageBase{

	public ElementsPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor)driver;
	}

	@FindBy(xpath = "//select[@id='owc']")
	WebElement selectmultipleoptions;
		
	
	@FindBy(xpath = "//select[@id='owc']")
	List<WebElement>options;
	
		
	public void selectmultipleoptions()
	{
		select =new Select(selectmultipleoptions);
		select.selectByVisibleText("Option 3");
	}
	
	
	public void printmultipleoptions()
	{
		//List<WebElement>options=driver.findElements(By.xpath("//select[@id='owc']"));
				
		for (WebElement element: options) 
		{
			System.out.println(element.getText());
		}
		
	}


	
	

}
