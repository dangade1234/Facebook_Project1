package TestClassesMany;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.ForgttonPassWordPage;

public class TestClass2 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam\\Downloads\\chromedriver_win32 110\\chromedriver.exe");
			
//			ChromeOptions option = new ChromeOptions();
//			option.addArguments("--remote-allow-origins=*");
//			WebDriver driver = new ChromeDriver(option);
		    
		    WebDriver driver = new ChromeDriver();
			
	        driver.manage().timeouts().implicitlyWait(12 , TimeUnit.SECONDS);//Version of 3.141.59
			
			driver.get("https://www.facebook.com");
			
			ForgttonPassWordPage forgottPass = new ForgttonPassWordPage(driver);
			forgottPass.clickforgotPass();
			forgottPass.getTextMessage();
			forgottPass.sendEmailPhone();
			forgottPass.clickCancalButton();
			forgottPass.clickSerchButton(); 
			forgottPass.getTextErrorTitleyourTemporalyText();
			forgottPass.getTextErrorMessagewhereMissUsing();
	
	}
	
}