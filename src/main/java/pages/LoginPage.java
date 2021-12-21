package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="#input-email")
	WebElement useremail;
	
	@FindBy(css="#input-password")
	WebElement userpassword;
	
	@FindBy(css="input[value='Login']")
	WebElement loginbutton;
	
	
	public void loginpage(String email , String password)
	{
		useremail.sendKeys(email);
		userpassword.sendKeys(password);
		loginbutton.click();
		
	}
	
	
	
}
