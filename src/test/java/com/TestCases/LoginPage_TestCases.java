package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginPage_TestCases extends BaseClass {

	@BeforeMethod
	public void loginInint()
	{
		BaseClass.initialize(new LoginPage(driver));
	}
	
	@Test
	public void testLoginValidCredential()
	{
		LoginPage.username("Pooja1234@gmail.com");
		LoginPage.password("pooja@123");
		LoginPage.remember();
		LoginPage.logIn();
		Assert.assertEquals(LoginPage.textAccount(), "Your Account");
	}
}
