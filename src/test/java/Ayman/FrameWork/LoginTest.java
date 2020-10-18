package Ayman.FrameWork;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends TestBase 

{
    @BeforeTest
    public void openBrowser()
    
    {   chromebrowser("http://testfire.net/login.jsp") ;
    
    }
    
    @Test 
    public void testLogin()
    {
    	LoginPage logobj = new LoginPage(driver);
    	logobj.loginMethod("admin", "admin");
    }
}
