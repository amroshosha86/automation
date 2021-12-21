package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegsiterPage extends PageBase {

	public RegsiterPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(css="#input-firstname")
	WebElement userFirstName;

	@FindBy(css="#input-lastname")
	WebElement userLastName;

	@FindBy(css="#input-email")
	WebElement useremail;

	@FindBy(css="#input-telephone")
	WebElement userPhone ;

	@FindBy(css="#input-password")
	WebElement userPassword;

	@FindBy(css="#input-confirm")
	WebElement userPasswordConform ;

	@FindBy(name="agree")
	WebElement userPolice;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueBtn;

	public void userRegForm
	(String FirstName , String LastName ,String email, String phone, String password)
	{
		userFirstName.sendKeys(FirstName);
		userLastName.sendKeys(LastName);
		useremail.sendKeys(email);
		userPhone.sendKeys(phone);
		userPassword.sendKeys(password);
		userPasswordConform.sendKeys(password);
		userPolice.click();
		continueBtn.submit();
		


	}
	
	





}
