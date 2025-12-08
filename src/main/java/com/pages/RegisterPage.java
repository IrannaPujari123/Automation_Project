package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Page;

public class RegisterPage implements Page{

	
	@FindBy(name="title") static WebElement txtTitle;
	@FindBy(name="first_name") static WebElement txtFirstname;
	@FindBy(name="last_name") static WebElement txtLastname;
	@FindBy(id="email") static WebElement txtEmail;
	@FindBy(id="phone") static WebElement txtPhoneNo;
	@FindBy(id="mobile") static WebElement txtMobile;
	@FindBy(id="password") static WebElement txtPassword;
	@FindBy(id="passconf") static WebElement txtCNFPassword;
	@FindBy(name="terms_agree") static WebElement checkTerms;
	@FindBy(name="mailing_list") static WebElement checkMails;
	@FindBy(id="register_submit") static WebElement btnRegister;
	
	@FindBy(xpath="//*[@id=\"main_content\"]/div[1]/ul/li") static WebElement successtext;
	
	@FindBy(id="email-error")static WebElement errorEmail;

	
	public RegisterPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public static void checkRegister(String title,String firstname, String lastname,String email, String phone_no,String mobile,
			String password, String confirmpassword)
	{
		txtTitle.sendKeys(title);
		txtFirstname.sendKeys(firstname);
		txtLastname.sendKeys(lastname);
		txtEmail.sendKeys(email);
		txtPhoneNo.sendKeys(phone_no);
		txtMobile.sendKeys(mobile);
		txtPassword.sendKeys(password);
		txtCNFPassword.sendKeys(confirmpassword);
		checkTerms.click();
		checkMails.click();
		btnRegister.click();
	}
	
	public static String sucessText()
	{
		return successtext.getText();
	}
	public static String EmailError()
	{
		return errorEmail.getText();
	}
}
