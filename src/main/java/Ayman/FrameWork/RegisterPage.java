package Ayman.FrameWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase 
{

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name="first_name")	
	WebElement Firstname;

	@FindBy(name="last_name")	
	WebElement lastname;

	@FindBy(name="fld_email")	
	WebElement email;
	
	@FindBy(name="fld_cemail")	
	WebElement cemail;
	
	@FindBy(name="fld_username")	
	WebElement username;
	
	@FindBy(name="fld_password")	
	WebElement password;
	
	@FindBy(name="dob")	
	WebElement dateofbirth;
	
	@FindBy(name="phone")	
	WebElement phonenumber;
	
	@FindBy(name="address")	
	WebElement addr;
	
	@FindBy(name="city")	
	WebElement City;
	
	@FindBy(name="state")	
	WebElement State;
	
	@FindBy(name="zip")	
	WebElement Zip;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[14]/div/button")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div")
	WebElement successtitle;
	

	public void registerMethod(String FIRSTNAME , String LASTNAME , String EMAIL ,String CONFIRMEMAIL , String USERNAME , String PASSWORD , String DATEOFBIRTH , String PHONENUMBER , String ADDRESS , String CITY  , String ZIP)
	{    Firstname.sendKeys(FIRSTNAME);
	     lastname.sendKeys(LASTNAME);
	     email.sendKeys(EMAIL);
	     cemail.sendKeys(CONFIRMEMAIL);
	     username.sendKeys(USERNAME);
	     password.sendKeys(PASSWORD);
	     dateofbirth.sendKeys(DATEOFBIRTH);
	     phonenumber.sendKeys(PHONENUMBER);
	     addr.sendKeys(ADDRESS);
	     City.sendKeys(CITY);
	     Select option = new Select(State);
	     option.selectByIndex(11);
	     Zip.sendKeys(ZIP);
	     submit.click();
	     
	}
	
	
	
}

