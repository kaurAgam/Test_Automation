package Day10;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingTestNG {
	@BeforeClass
	public void beforeClass() {
		System.out.println("First to be executed Before class\n");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("executed after class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Test\n");
	}
	@Test(priority=0)
	public void testcase1() {
		System.out.println("Test Case 1");
	}
	@Test(priority=1)
	public void testcase2() {
		System.out.println("Test Case 2");
	}
	@Test(priority=2)
	public void testcase3() {
		System.out.println("Test Case 3");
	}
	@Test(priority=3)
	public void testcase4() {
		System.out.println("Test Case 4");
	}
	@Test(priority=4)
	public void testcase5() {
		System.out.println("Test Case 5");
	}
	@Test(priority=5)
	public void testcase6() {
		System.out.println("Test Case 6");
	}
}
