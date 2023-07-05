package Day10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Guru99Project {
	ChromeDriver driver;
	
	@BeforeClass
	public void invokeBrowser() {
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		//driver=new ChromeDriver(co);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4");
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@Test
	public void verifyPageTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle="Guru99 Bank Home Page";
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}

}
