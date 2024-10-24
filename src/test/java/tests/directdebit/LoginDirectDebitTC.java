package tests.directdebit;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.directdebit.DirectDebitLoginPage;

public class LoginDirectDebitTC extends BaseClass {
	
	@Test(dataProvider = "loginData")
	public void verifyLogin(String username, String password, boolean isValid)
	{
		DirectDebitLoginPage loginPage = new DirectDebitLoginPage(driver);
		loginPage.login(username, password);
		if
	}
}
