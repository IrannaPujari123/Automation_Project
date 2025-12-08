package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ExcelData.RegisterTestData;
import com.base.BaseClass;
import com.pages.RegisterPage;

public class Register_TestCases extends BaseClass{
	
	@BeforeMethod
	public static void registerInit()
	{
		BaseClass.initialize(new RegisterPage(driver));
	}

	@Test(dataProvider = "RTestData")
	void testRegister(String title,String First_Name, String Last_Name,String Email,String Phone,String Mobile,
			String Password, String Confirm_Password,String isSuccess) throws Exception
	{
		System.out.println("Enter in Test Case");
		RegisterPage.checkRegister(title,First_Name,Last_Name,Email,Phone, Mobile, Password,Confirm_Password);
		if(isSuccess.equalsIgnoreCase("FALSE"))
		{
			Assert.assertEquals(driver.getTitle(), "Register");
		}else if(isSuccess.equals("TRUE"))
		{
			Assert.assertEquals(RegisterPage.sucessText(), "Your email address has been added to our mailing list.");
		}
		//Assert.assertEquals(RegisterPage.sucessText(), "Your email address has been added to our mailing list.");
	}
	
	@DataProvider(name="RTestData")
	public String[][] testData() throws Exception
	{
		System.out.println("data provider");
		return RegisterTestData.read_Excel_Data();
	}
}
