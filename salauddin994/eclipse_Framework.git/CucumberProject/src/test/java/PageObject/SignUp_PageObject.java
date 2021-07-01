package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.TestData;

public class SignUp_PageObject {
	 public SignUp_PageObject(WebDriver driver){
	        PageFactory.initElements(driver, this);
	    }
	 
	 @FindBy(how=How.ID,using="consent-close")
		public WebElement popupwindow;
	 
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/header/div[1]/div/div/div[3]/div/div/div/div/button/span/i")
	public WebElement Signin;
	
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/header/div[1]/div/div/div[3]/div/div/div/div/div/a[2]")
	public WebElement createAccount;
	
	@FindBy(how=How.ID,using="registration-form-fname")
	public WebElement setFirstName;

	@FindBy(how=How.ID,using="registration-form-lname")
	public WebElement setLastName;
	
	@FindBy(how=How.ID,using="registration-form-email")
	public WebElement setEmail;
	
	@FindBy(how=How.ID,using="registration-form-password")
	public WebElement setPassword;
	
	@FindBy(how=How.ID,using="registration-form-password-confirm")
	public WebElement setConPassword;
	
	@FindBy(how=How.ID,using="registration-form-zipcode")
	public WebElement setZipCode;
	
	@FindBy(how=How.ID,using="registration-form-phone")
	public WebElement setPhoneNumber;
	
	@FindBy(how=How.ID,using="canadian-customer-no")
	public WebElement radioBtn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"maincontent\"]/div/div/div/div/form/fieldset[2]/div[2]/label/span")
	public WebElement saksfifthAveRadioBtn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"maincontent\"]/div/div/div/div/form/div[7]/button")
	public WebElement clickCreatAccountBtn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"maincontent\"]/div/div[3]/div/div/div[2]")
	public WebElement WelcomeValidation;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"maincontent\"]/div/div[3]/div/div/div[2]/span[1]")
	public WebElement onlyWelcomeText;
	
	
	
	
	
	
	
	
	
	

}
