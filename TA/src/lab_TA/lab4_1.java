package lab_TA;
//DRAG AND DROP
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class lab4_1 {
//DRAG AND DROP
		public static void main(String[] args){
			ChromeDriver driver;
		
			driver=new ChromeDriver () ;
			driver.manage().window().maximize() ;
			driver.manage().deleteAllCookies();
			driver.get("https://jqueryui.com/droppable/");
			WebElement frameID =driver.findElement(By.className("demo-frame"));
			driver.switchTo().frame(frameID);
			WebElement source =driver.findElement(By.id("draggable"));
			WebElement target =driver.findElement(By.id("droppable"));
			Actions action=new Actions(driver);
			action.dragAndDrop(source, target).build().perform();

}
}
