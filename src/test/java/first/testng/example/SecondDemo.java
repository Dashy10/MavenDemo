package first.testng.example;

import org.testng.annotations.Test;

public class SecondDemo {
	@Test(dependsOnMethods = ("secondTest"), alwaysRun = true)
	public void firstTest() {
		System.out.println("first test");
	}
	
	@Test(timeOut = 100)
	public void secondTest() {
		System.out.println("second test");
	}
	
	@Test(enabled = false)
	public void thirdTest() {
		System.out.println("third test");
	}

}
