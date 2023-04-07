package TestClassesMany;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ModuleHinddenpopUpPage.SignUpPageHiddenPopUp;

public class TestClass3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivam\\Downloads\\chromedriver_win32 110\\chromedriver.exe");
		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(option);
	    
	    WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(12 , TimeUnit.SECONDS);//Version of 3.141.59
		
		driver.get("https://www.facebook.com");
		
		SignUpPageHiddenPopUp signUp = new SignUpPageHiddenPopUp(driver);
		signUp.clickcreateNewAcc();
		signUp.sendFirstName();
		signUp.sendSurName();
		signUp.sendMobileNoOrEmail();
		signUp.sendNewPassWord();
		signUp.getTexttextBirthDate();
		signUp.selectBirthOfDay();
		signUp.selectBirthOfMonth();
		signUp.selectBirthOfYear();
		signUp.getTextTextGender();
		signUp.clickFemaleButton();
		signUp.clickMaleButton();
		signUp.clickCustomButton();
		Thread.sleep(2000);
		signUp.selectPronOunce();
		Thread.sleep(2000);
		signUp.sendGenderOpt();
		signUp.clickSignUpButton();
	}
}
