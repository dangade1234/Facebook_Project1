package TestClassesMany;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Page.LoginPage;

public class TestClass1 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.edge.driver","C:\\Users\\Shivam\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			
//			ChromeOptions option = new ChromeOptions();
//			option.addArguments("--remote-allow-origins=*");
//			WebDriver driver = new ChromeDriver(option);
		    
		    WebDriver driver = new EdgeDriver();
			
	        driver.manage().timeouts().implicitlyWait(12 , TimeUnit.SECONDS);//Version of 3.141.59
			
			driver.get("https://www.facebook.com");
			
			LoginPage loginPage = new LoginPage(driver);
			
			loginPage.sendUserName("");
			loginPage.sendpassWord("");
			loginPage.clickloginButton();
		//	loginPage.clickforgotPass();
		//	loginPage.clickcreateNeAcc();
	
}
}
//C:\\Users\\Shivam\\Downloads\\chromedriver_win32 110\\chromedriver.exe
