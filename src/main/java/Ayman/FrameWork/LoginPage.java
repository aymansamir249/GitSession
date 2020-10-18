package Ayman.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(id="uid")	
WebElement username;

@FindBy(id="passw")	
WebElement password;

@FindBy(name="btnSubmit")	
WebElement btn;

public void loginMethod(String user , String pass)
{    username.sendKeys(user);
     password.sendKeys(pass);
     btn.click();
}



}









