package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgttonPassWordPage {

	//Veriabe Decleration
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement passWord ;
	
	@FindBy (xpath = "//a[text()='Forgotten password?']")
	private WebElement forgotPass ;
	
	@FindBy (xpath =  "//table//div")
	private WebElement textMessage ;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement emailPhone ;
	
	@FindBy (xpath = "//a[text()='Cancel']")
	private WebElement cancalButton ;
	
	@FindBy (xpath = "//button[text()='Search']")
	private WebElement serchButton ;
	
	@FindBy (xpath = "//h3[text()='You’re Temporarily Blocked']")
	private WebElement yourTemporalyText ;
	
	@FindBy (xpath = "//ul[@class='uiList _4kg _6-h _6-j _6-i']")
	private WebElement whereMissUsing ;
	
 //	Variable Initialization
	
	public ForgttonPassWordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//Veriable Use //WebElement Actions
	
	public void sendUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void sendpassWord(String pass) {
		passWord.sendKeys(pass);
	}
	
//	public void sendpassWord() {
//		passWord.sendKeys("9977665511");
//	}
	
	public void clickforgotPass() {
		forgotPass.click();
	}
	
	public String getTextMessage() {
		String text = textMessage.getText();
		return text;
	}
	
	public void sendEmailPhone() {
		emailPhone.sendKeys("pooja9977@gmail.com");
	}
	
	public void clickCancalButton() {
		cancalButton.click();
	}
	
	public void clickSerchButton() {
		serchButton.click();
		
	}

	public String getTextErrorTitleyourTemporalyText() {
	    return yourTemporalyText.getText();
		
	}
	
	public String getTextErrorMessagewhereMissUsing() {
		 return whereMissUsing.getText();
		
	}

	
	}
	
	
	
	
		
	

