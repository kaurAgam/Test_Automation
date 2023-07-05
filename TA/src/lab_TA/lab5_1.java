package lab_TA;
//ANOTHER TAB
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab5_1 {

	public static void main(String[] args) {

			        // TODO Auto-generated method stub
        ChromeDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
        String parentWindow=driver.getWindowHandle();
        System.out.println("Parent window handle = "+parentWindow);
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.tagName("button")).click();
        String childWindow=driver.getWindowHandles().toArray()[1].toString();
        System.out.println("First Child Window Handle = "+childWindow);
        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
        driver.quit();

	}

}
