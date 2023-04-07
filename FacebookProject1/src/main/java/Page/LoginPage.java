package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Variable Decleration 
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement passWord ;
	
	@FindBy (xpath = "//button[text()='Log in']")
	private WebElement loginButton ;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPass ;
	
	@FindBy (xpath = "//a[text()='Create new account']")
	private WebElement createNewAcc ; 
	
	//Variabe initialization
	//
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	// Veriabe Use //WebElement Action 
	
	public void sendUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void sendpassWord(String pass) {
		passWord.sendKeys(pass);
		
	}
	
//	public void sendpassWord() {
//		passWord.sendKeys("9977665511");
//	}
	
	public void clickloginButton() {
		loginButton.click();
	}
	
	public void clickforgotPass() {
		forgotPass.click();
	}
	
	public void clickcreateNewAcc() {
		createNewAcc.click();
		
	}
	
	
	}

