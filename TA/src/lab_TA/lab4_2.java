package lab_TA;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;    
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;  
public class lab4_2 {

	WebDriver driver;
    public void invokeBrowser(String browserType){
		    if(browserType.equalsIgnoreCase("chrome")){
		           driver = new ChromeDriver();}
		   else if(browserType.equalsIgnoreCase("firefox")) {  
		           //System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		        driver = new FirefoxDriver();}
    }
}



