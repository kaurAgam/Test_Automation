package Day11;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTesting1 {
	
	@Parameters({"userId","userPass"})
	@Test
	public void TC1(String userName,String password) {
		System.out.println("Class 1 -TC 1");
		System.out.println("User Name:"+userName+" ;Password :"+password);
	}
	@Test
	public void TC2() {
		System.out.println("Class 1 -TC 2");
	}
	@Test
	public void TC3() {
		System.out.println("Class 1 -TC 3");
	}
}
