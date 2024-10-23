package pages.directdebit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DirectDebitLoginPage {
	
	WebDriver driver;
	
	public DirectDebitLoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By emailField = By.id("email");
	By passwordField = By.id("passowrd");
	By loginButton = By.id("loginButton");
	
	public void enterEmail(String email) 
	{
		driver.findElement(emailField).sendKeys(email);
	}
	
	public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
	
	public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
	
	public String getLoginPageTitle() {
        return driver.getTitle();
    }
}
