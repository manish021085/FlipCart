package flipcart.E2E_SECOND;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagefactory.HomepageLogin;
import testbase.TestBase;

public class HomepageLoginTest extends TestBase{
	HomepageLogin hpl;
	
	@BeforeMethod
	public void setup() throws IOException{
		initilizeDriver();
		driver.get("https://www.flipkart.com/");
		
	}
	
	@Test
	public void validateloginTest() throws IOException
	{
		//driver=initilizeDriver();
		//driver.get("https://www.flipkart.com/");
		//browser setup and url define in Before method so that each and 
		//every test case need not require browser intitlialization in every test
		//Code redundency and duplicacy removed
		hpl =new HomepageLogin(driver);
		hpl.getLoginid().sendKeys("8512070339");
		hpl.getPassword().sendKeys("manish003@");
		hpl.getLogin().click();	
		
	}
	
	@Test
	public void validateLoginPageTitleTest(){
		hpl=new HomepageLogin(driver);
		System.out.println(hpl.getTitle());
		Assert.assertEquals(hpl.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println("HomePage Title Matched");
		
	}
	

}
