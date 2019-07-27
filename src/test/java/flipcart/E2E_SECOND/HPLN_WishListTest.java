package flipcart.E2E_SECOND;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagefactory.HPLN_WishList;
import pagefactory.HomepageLogin;
import testbase.TestBase;

public class HPLN_WishListTest extends TestBase{
	
	
	@BeforeMethod
	public void setup() throws IOException{
	
	initilizeDriver();
	HomepageLogin hpl =new HomepageLogin(driver);
	hpl.login("", "");
	}
	@Test
	public void loginPageTest() throws IOException
	{
		
		
		HPLN_WishList hpln = new HPLN_WishList(driver);
	
		Actions a = new Actions(driver);
		
		a.moveToElement(hpln.getHover()).build().perform();
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(hpln.getWishList()));
		
		hpln.getWishList().click();
		
		
		
	}
	
	

}
