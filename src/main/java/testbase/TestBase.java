package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public FileInputStream fis;
	
public WebDriver initilizeDriver()
{
	prop =new Properties();
	
	try {
		fis = new FileInputStream("C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\E2E_SECOND\\src\\main\\java\\resources\\Config.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("exception occur");
	String browserName=prop.getProperty("browser");
	if(browserName.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser Driver\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	else if(browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser Driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browserName.equals("InternetExplorer"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Browser Driver\\IEServerdriver.exe");
		driver= new ChromeDriver();
	}
	
	return driver;
}

	
	
	

}
