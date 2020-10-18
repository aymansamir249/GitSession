package Ayman.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
    protected WebDriver driver ;
    
    public void chromebrowser(String url)

	{ WebDriverManager.chromedriver().setup();
	driver  =new ChromeDriver();
	driver.navigate().to(url);
    }
}