package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		
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
