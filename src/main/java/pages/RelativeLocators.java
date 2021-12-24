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

public class RelativeLocators extends PageBase{

	public RelativeLocators(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor)driver;
	}

	@FindBy(xpath = "//select[@id='owc']")
	WebElement selectmultipleoptions;
	
	
		

	
	public void printmultipleoptions()
	{
		
	}


	
	

}
