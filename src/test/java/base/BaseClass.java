package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public Properties properties;
	
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void setup(String browser) throws Exception 
	{
		String baseUrl = properties.getProperty("baseUrl");
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		if (browser.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ïe")) 
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.get(baseUrl);
		
	}
	
	@AfterMethod
    public void tearDown() 
	{
        if (driver != null) 
        {
            driver.quit();
        }
    }
	
}
