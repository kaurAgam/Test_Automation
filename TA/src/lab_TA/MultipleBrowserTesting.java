package lab_TA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTesting {

	WebDriver driver;
	public void invokeBrowser(String browserType) {
		if(browserType.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		
		else if(browserType.equalsIgnoreCase("firefox")) {
			//below line is to be used if firefox launching is giving error
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\modip\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
}
