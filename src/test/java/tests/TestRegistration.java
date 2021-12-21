package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegsiterPage;

public class TestRegistration extends TestBase{
	
	HomePage homeobj;
	RegsiterPage regsiterobj ;

	String FirstName=fake.name().fullName();
	String LastName=fake.name().lastName();
	String email =fake.internet().emailAddress();
	String phone=fake.phoneNumber().cellPhone();
	String password="12345678";
	
  @Test(priority = 1)
  public void UserCanReg()
	{
		homeobj=new HomePage(driver); 
		regsiterobj=new RegsiterPage(driver);
		homeobj.openMyAccountLink();
		homeobj.openRegistrationPage();
		regsiterobj.userRegForm(FirstName, LastName, email, phone, password);


	}
}
