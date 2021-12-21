package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends PageBase {

	public LogOutPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//p[contains(text(),'You have been logged off your account. It is now s')]")
	public WebElement logoutmessage;




}
