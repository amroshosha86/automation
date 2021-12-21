package tests;

import org.testng.annotations.Test;

import pages.ElementsPage;

public class MultipleOptionsTest extends TestBase {
	ElementsPage ElementsPageobj;
	
  @Test
  public void UserCanSelectOptions() throws InterruptedException {
	  ElementsPageobj=new ElementsPage(driver);
	  ElementsPageobj.selectmultipleoptions();
	  ElementsPageobj.printmultipleoptions();
	  
	  
	  
  }
}
