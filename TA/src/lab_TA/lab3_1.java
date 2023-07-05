package lab_TA;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class lab3_1 {

		//driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MILLISECONDS);
		ChromeDriver driver;
		public void invokeBrowser() {
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
			driver.get("https://www.hongkiat.com/blog/websites-creative-mouse-over-effects/");
	        //driver.get("https://www.amazon.com")
		}
		
		public void fluentWait(int timeOut, int pollingTime, By by) {
			Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}

		
		public void waitTillElementVisible(Duration timeOutInSeconds,By by) {
			WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		}	


		public void mouseHover() {
			WebElement mainMenu=driver.findElement(By.xpath("//*[@id=\"all-menu\"]/span"));
			Actions action=new Actions(driver);
			action.moveToElement(mainMenu).build().perform();
			By bye=By.xpath("//*[@id=\"all-list\"]/li[1]/ul/li[4]/a");
			waitTillElementVisible(Duration.ofSeconds(10),bye);
			WebElement we=driver.findElement(By.xpath("//*[@id=\"all-list\"]/li[1]/ul/li[4]/a"));
			action.moveToElement(we).click(we).build().perform();
		}
		

		
		public void closeBrowser() {
			//driver.close() //close current browser
			driver.quit();  //close all browsers
		}
	//*[@id="all-menu"]
	//*[@id="design-dev-menu"]
	//*[@id="offcanvas-nav"]/ol/li[4]/a
	//else->//*[@id=\"all-list\"]/li[1]/ul/li[4]/a
	//all -> //*[@id="all-menu"]
	// contct //*[@id="all-list"]/li[1]/ul/li[4]/a
	// //*[@id="all-list"]/li[1]/ul/li[4]
}

