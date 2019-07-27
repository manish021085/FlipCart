package flipcart.E2E_SECOND;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagefactory.HomePage;
import pagefactory.HomepageLogin;
import testbase.TestBase;

public class HomePageTest extends TestBase {
	HomepageLogin hpl;
	HomePage hp;
	
	@BeforeMethod()
	public void setup() throws IOException{
	initilizeDriver();
	driver.get("https://www.flipkart.com/");
	hpl =new HomepageLogin(driver);
	hpl.login("8512070339", "manish003@");
	}
	
	@Test
	public void basePageTest() throws IOException
	{
		hp=new HomePage();
		//Actions action=new Actions(driver);
		//action.moveToElement(hp.getElectronicsOption()).build().perform();
		//hp.getSamsungOption().click();
		hp.getElectroicsOption();
		
		
		
	}
	
	

}
