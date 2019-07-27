package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class HomepageLogin {
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement loginid;
	//By loginid = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	
	By password = By.xpath("//input[@type='password']");
	By login = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	
	
	public HomepageLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginid()
	{
		//return driver.findElement(loginid);
		return loginid;
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public HomePage login(String username,String password){
		getLoginid().sendKeys("8512070339");
		getPassword().sendKeys("manish003@");
		getLogin().click();
		return new HomePage();
	}
	
	public String getTitle(){
		return driver.getTitle();
		
	}
}
