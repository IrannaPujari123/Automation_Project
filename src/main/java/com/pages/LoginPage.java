package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Page;

public class LoginPage implements Page {

	@FindBy(id="login-username") static WebElement  txtEmail;
	@FindBy(id="login-password") static WebElement txtPassowrd;
	@FindBy(id="login-remember") static WebElement checkRemember;
	@FindBy(xpath="//*[@id=\"main_content\"]/h2") static WebElement textAccount;
	@FindBy(xpath="//*[@id=\"login_form\"]/div[5]/div/button") static WebElement btnLoginIn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public  static void  username(String email)
	{
		txtEmail.sendKeys(email);
	}
	public  static void password(String email)
	{
		txtEmail.sendKeys(email);
	}
	public static void remember()
	{
		checkRemember.click();
	}
	public static void logIn()
	{
		btnLoginIn.click();
	}
	
	public static String textAccount()
	{
		return textAccount.getText();
	}
	
}
