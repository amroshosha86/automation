package tests;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogOutPage;
import pages.LoginPage;
import pages.RegsiterPage;

public class TestLogin extends TestBase {

	HomePage homeobj;
	RegsiterPage regsiterobj ;
	LogOutPage LogOutobj;
	LoginPage LoginPageobj;

	String FirstName=fake.name().fullName();
	String LastName=fake.name().lastName();
	String email =fake.internet().emailAddress();
	String phone=fake.phoneNumber().cellPhone();
	String password="12345678";
	String Actmessage="You have been logged off";

	@Test(priority = 0)
	public void UserCanReg()
	{
		homeobj=new HomePage(driver); 
		regsiterobj=new RegsiterPage(driver);
		homeobj.openMyAccountLink();
		homeobj.openRegistrationPage();
		regsiterobj.userRegForm(FirstName, LastName, email, phone, password);


	}

	@Test(priority = 1)
	public void UserCanLogout() 
	{
		homeobj.logout();
		LogOutobj=new LogOutPage(driver);
		Assert.assertTrue(LogOutobj.logoutmessage.getText().contains(Actmessage));
		
	}
	

	@Test(priority = 2)
	public void UserCanLogin() 
	{
		homeobj.openloginpage();
		LoginPageobj=new LoginPage(driver);
		LoginPageobj.loginpage(email, password);
		
		
	}
	
	
	
	
}
