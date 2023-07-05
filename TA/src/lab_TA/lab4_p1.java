package lab_TA;
//ALERT
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab4_p1 {


		public static void main(String[] args){
			ChromeDriver driver;
		
			driver=new ChromeDriver () ;
			driver.manage().window().maximize() ;
			driver.manage().deleteAllCookies();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			driver. switchTo().frame ("iframeResult");
			//Come out of frames, although after accepting an alert it will automatically come out of it
			//driver. switchTo().defaultContent ();
			driver.findElement(By.tagName("button")).click();
			Alert alert = driver. switchTo().alert ();
			System.out.println(alert.getText());
			alert.accept();

}
}
