package Ayman.FrameWork;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testData.ExcelDataReader;

public class RegisterTest extends TestBase 

{   
	@DataProvider(name="data")
    public Object[][] getTestData() throws IOException
    {   
	   ExcelDataReader obj = new ExcelDataReader();
	   return obj.getExcelData();
    }
	
	@BeforeTest
    public void openBrowser()
    
    {   chromebrowser("https://www.performancetestingpractice.com/register.php") ;
    
    }
    
    @Test(dataProvider="data") 
    public void testRegister(String FIRSTNAME ,String LASTNAME ,String EMAIL ,String CONFIRMEMAIL, String USERNAME, String PASSWORD, String DATEOFBIRTH, String PHONENUMBER, String ADDRESS, String CITY, String ZIP  )
    {
    	RegisterPage regobj = new RegisterPage(driver);
        regobj.registerMethod(FIRSTNAME, LASTNAME, EMAIL, CONFIRMEMAIL, USERNAME, PASSWORD, DATEOFBIRTH, PHONENUMBER, ADDRESS, CITY, ZIP);  	
        assertEquals(regobj.successtitle.getText(),"User is successfully Register. Now You can Login");

    }
   
    
    
}


