package StepDef;

import org.testng.Assert;

import com.github.javafaker.Faker;

import Base.Config;
import Base.TestData;
import Base.Utillity;
import PageObject.SignUp_PageObject;
import io.cucumber.java.en.*;

public class SignUp_Steps extends Config {
	SignUp_PageObject signup=new SignUp_PageObject(driver);
	Faker faker = new Faker();
	
	
	@Given("User on saksfifth avenue homepage")
	public void user_on_saksfifth_avenue_homepage() {
		
		signup.popupwindow.click();
		Assert.assertEquals(driver.getTitle(), TestData.expTitle);
	}

	@Given("Hover over signIn button and click on creat an account link")
	public void hover_over_sign_in_button_and_click_on_creat_an_account_link() {
		
	    Utillity.mouseHoverOver(signup.Signin, signup.createAccount);

	}

//	@Given("^I fillout the form using following ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) $")
//	public void i_fillout_the_form_using_following_sala_uddin_salauddin879_gmail_com_test1234_test1234(String firstName,String lastName,String email,String password,String confirmpassword,String zipcode,String phonenumber) throws InterruptedException {
//	   signup.enterFirstNamefromTable(firstName);
//	}
	
	@Given("I fillout the form using Valid information")
	public void i_fillout_the_form_using_valid_information() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), TestData.expTitle_LoginPage);
		TestData.global_FirstName=faker.name().firstName();
		signup.setFirstName.sendKeys(TestData.global_FirstName);
		signup.setLastName.sendKeys(faker.name().lastName());
		signup.setEmail.sendKeys(faker.internet().emailAddress());
		signup.setPassword.sendKeys(TestData.Password);
		signup.setConPassword.sendKeys(TestData.Password);
		signup.setZipCode.sendKeys(faker.address().zipCode());
		signup.setPhoneNumber.sendKeys(TestData.global_PhoneNumber);
	}


	@Given("Verify Are you canadian customer radio button by defult NO")
	public void verify_are_you_canadian_customer_radio_button_by_defult_no() {
	   boolean enableOrNot= signup.radioBtn.isEnabled();
	   Assert.assertEquals(enableOrNot, true);
	}

	@Given("Click on saks fifth ave radio button")
	public void click_on_saks_fifth_ave_radio_button() {
		signup.saksfifthAveRadioBtn.click();
	  
	}

	@Given("Click on Create Account button")
	public void click_on_create_account_button() {
	   signup.clickCreatAccountBtn.click();
	   
	  String welcomeMsg= signup.WelcomeValidation.getText();
	  String expMsg =signup.onlyWelcomeText.getText()+" "+TestData.global_FirstName;
	  Assert.assertEquals(welcomeMsg,expMsg );
	  Assert.assertEquals(driver.getTitle(), TestData.after_Signup_Title);
	   
	}



}
