package pagefactory;

import javax.swing.text.StyleContext.SmallAttributeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class HomePage extends TestBase {
	
	

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/ul/li[1]/span")
	WebElement electronics;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[4]/a")
	WebElement samsung;
	
	public WebElement electronicsOption(){
		return electronics;
	}
	
	public WebElement getSamsungOption(){
		return samsung;
	}
	
	
	
	public void getElectroicsOption(){
		Actions action=new Actions(driver);
		action.moveToElement(electronicsOption()).build().perform();
		getSamsungOption().click();
	}

}
