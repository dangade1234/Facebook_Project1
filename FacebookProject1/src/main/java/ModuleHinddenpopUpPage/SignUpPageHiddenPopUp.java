package ModuleHinddenpopUpPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageHiddenPopUp {

	@FindBy (xpath = "//a[text()='Create new account']")
	private WebElement createNewAcc ; 
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement firstName123 ;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement surname ;
	
	@FindBy (xpath = "(//input[@type='text'])[4]")
	private WebElement mobileNoOrEmail ;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	private WebElement newPassWord ;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	private WebElement newPassWord1 ;
	
	
	@FindBy (xpath = "//div[text()='Date of birth']")
	private WebElement textBirthDate ;                //getText
	
	@FindBy (xpath = "//select[@id='day']")
	private WebElement birthOfDay ;                  //pass the select class as option tagname in
	                                                 //pass in index selectByIndex
	@FindBy (xpath = "//select[@id='month']")
	private WebElement birthOfMonth ;               //pass the Attribute name (tagname option 
	                                               //Attribute name (value)as argu //selectByAttributeValue
	@FindBy (xpath = "//select[@id='year']")
	private WebElement birthOfYear ;              //pass the select by text as a argument 
	
	@FindBy (xpath = "//div[text()='Gender']")
	private WebElement textGender ;               //getText
	
	@FindBy (xpath = "//span[@class='_5k_2 _5dba'][1]")
	private WebElement femaleButton ;
	
	@FindBy (xpath = "//span[@class='_5k_2 _5dba'][2]")
	private WebElement maleButton ;
	
	@FindBy (xpath = "//span[@class='_5k_2 _5dba'][3]")
	private WebElement customButton ;
	
	@FindBy (xpath = "//select[@id='js_25']")
	private WebElement pronOunce ;
	
	@FindBy (xpath = "//div[text()='Gender (optional)']")
	private WebElement genderOpt ;
	
	@FindBy (xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signUpButton ;
	
	//Veriable Initialization
	
	public  SignUpPageHiddenPopUp (WebDriver  driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Veriable Use Veriable Action
	
	public void clickcreateNewAcc() {
		createNewAcc.click();
	}
	
	public void sendFirstName ( ) {
		firstName.sendKeys("Pooja");
	}
	
	public void sendSurName() {
		surname.sendKeys("Dangade");
		
	}
	
	public void sendMobileNoOrEmail () {
		mobileNoOrEmail.sendKeys("dangade059@gmail.com");
		
	}
	
	public void sendNewPassWord () {
		newPassWord.sendKeys("9359379832");
		
	}
	
	public void getTexttextBirthDate () {
		String text = textBirthDate.getText();
		
	}
	
	public void selectBirthOfDay () {
		Select select = new Select(birthOfDay);
		select.selectByVisibleText("14");
	
	}
	
	public void selectBirthOfMonth () {
		Select select = new Select(birthOfMonth);
		select.selectByVisibleText("Jun");
		
	}
	
	public void selectBirthOfYear() {
		Select select = new Select(birthOfYear);
		select.selectByVisibleText("1997");
		
	}
	
	public void getTextTextGender () {
		String text = textGender.getText();
		
		
	}
	
	public void clickFemaleButton () {
		femaleButton.click();
		
	}
	
	public void clickMaleButton () {
		maleButton.click();
		
	}
	
	public void clickCustomButton() {
		customButton.click();
		
	}
	
	public void selectPronOunce () {
		Select select = new Select (pronOunce) ;
		select.selectByValue("value");
		
	}
	public void sendGenderOpt() {
		genderOpt.sendKeys("female");
			
	}
	
	public void clickSignUpButton () {
		signUpButton.click();
		
	}
	
	
	
}