package lab_TA;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;


//guru99
public class lab_2 {

		ChromeDriver driver;
		
		public void invokeBrowser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://demo.guru99.com/v4");
		}
		public void login(String username,String password) {
			WebElement userId;
			userId=driver.findElement(By.name("uid"));
			userId.sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("btnLogin")).click();
			
		}
		public void addAccount(String customerId) {
			driver. findElement (By.linkText("New Account")).click();
			driver. findElement(By.name("cusid")).sendKeys(customerId);
			WebElement selDropdown = driver.findElement(By.name("selaccount"));
			Select selAccount = new Select(selDropdown);
			selAccount. selectByVisibleText("Current");
			driver. findElement (By .name("inideposit")).sendKeys("583465");
			driver. findElement(By.name("button2")).click();
			   
		}
		public void closeBrowser() {
			driver.quit();
		}

	

}
