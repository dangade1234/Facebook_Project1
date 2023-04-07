package TestNgTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Page.ForgttonPassWordPage;
import Page.LoginPage;

public class VerifyForgottPassordPage {
    
	WebDriver driver ;
	LoginPage loginPage ;
	ForgttonPassWordPage forgottPass ;

	//CROSS BROWSER TESTING 
	
	@Parameters ("Browser")
	@BeforeTest 
	public void OpenTheBrowser(String browserName) {
		System.out.println("BeforeTest");
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam\\Downloads\\chromedriver_win32 110\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if(browserName.equals("Firefox"))
		{
		    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shivam\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Shivam\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(12 , TimeUnit.SECONDS);//Version of 3.141.59
		}
	
//	@BeforeClass
//	public void OpenTheBrowser() {
//		System.out.println("BeforeClass");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam\\Downloads\\chromedriver_win32 110\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(12 , TimeUnit.SECONDS);//Version of 3.141.59
//		
//	}
	
	@BeforeMethod 
	public void gotoForgottPasswordPage () {
		System.out.println("BeforeMethod");
		driver.get("https://www.facebook.com/");
	    loginPage = new LoginPage(driver);
		loginPage.clickforgotPass();
		loginPage.sendUserName("");
		loginPage.sendpassWord("");
		forgottPass = new ForgttonPassWordPage(driver);
	}
	
	
	@Test (priority = 1) //, invocationCount = 2)
	public void verifyMessageOnForgotPassWordPage() {
		System.out.println("Test 1");
		String actualMsg = forgottPass.getTextMessage();
		String expectedMsg = "Please enter your email address or mobile number to search for your account.";
		if(actualMsg.equals(expectedMsg))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
	
	
	@Test (priority = 2) //  dependsOnMethods = {"test 3"})
	public void verifyCancelButtonOnForgotPassWordPage() {
		System.out.println("Test 2");
	//	ForgttonPassWordPage forgottPass = new ForgttonPassWordPage(driver);
		forgottPass.clickCancalButton();
		String expectedURL = "https://www.facebook.com/login.php";
		String expectedTitle = "Log in to Facebook";
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		if(expectedURL.equals(actualURL) && expectedTitle.equals(actualTitle))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	}
	
	@Test (priority = 3)
	public void verifySearchButtonOnForgotPassWordPage() {
		System.out.println("Test 3");
		forgottPass.sendEmailPhone();
		forgottPass.clickSerchButton();
		String expectedErrorTitle = "fdergtyhuihy";
		String expectedErrorMessage = "gtredwsayrf";
		String actualErrorTitle = forgottPass.getTextErrorTitleyourTemporalyText();
		String actualErrorMessage = forgottPass.getTextErrorMessagewhereMissUsing();
		if(expectedErrorTitle.equals(actualErrorTitle) && expectedErrorMessage.equals(actualErrorMessage) )
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}
	
		}
	
		
	@AfterMethod
	public void AfterMethodLogOutApplication() {
			System.out.println("AfterMethod");  //LogOutKaCode
		}
	    
//	@AfterClass
//	public void BrowserClosed() {
//		System.out.println("AfterClass");
//		driver.quit();
//	}
    
	@AfterTest
	public void BrowserClosed() {
		System.out.println("AfterClass");
		driver.quit();
	}
	}
	
	
	

	
	

