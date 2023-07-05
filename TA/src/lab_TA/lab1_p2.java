package lab_TA;

import org.openqa.selenium.chrome.ChromeDriver;

public class lab1_p2 {
	ChromeDriver driver;

	public void invokeBrowser() {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
	}
	public void getPageTitle() {
		System.out.println("Page Title = " + driver.getTitle());
		
	}
	public void navigateCommands() {
		driver.navigate().to("http://www.yahoo.com");
		driver.navigate().back();//clicking the previous button
		driver.navigate().forward();//clicking forward button
		driver.navigate().refresh();//clicking refresh button
	}
	public void closeBrowser() {
		driver.quit();
		
	}
}
