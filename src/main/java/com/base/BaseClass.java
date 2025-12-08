package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.pages.LoginPage;
import com.pages.RegisterPage;
import com.utilities.ConfigUtilities;

public abstract class BaseClass {
	public static WebDriver driver;
	public RegisterPage rp;
	public LoginPage lp;

	@BeforeSuite
	public void setup() throws Exception {
		String brName = ConfigUtilities.readConfig("browser");
		if (brName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (brName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (brName.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Invalid browser");
		}
		String Url = ConfigUtilities.readConfig("url");
		driver.get(Url);
	}
	public static Page pg;
	public static void initialize(Page page)
	{
		pg=page;
	}

	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
