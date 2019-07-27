package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HPLN_WishList {
	public WebDriver driver;
	
	


	
	
	By hover = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/span/div");
	By wishlist = By.xpath("//ul[@claas='RlwYhr.undefined']/li[5]");
	
	
	public HPLN_WishList(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public WebElement getHover()
	{
		return driver.findElement(hover);
	}
	public WebElement getWishList()
	{
		return driver.findElement(wishlist);
	}
	
	

}
