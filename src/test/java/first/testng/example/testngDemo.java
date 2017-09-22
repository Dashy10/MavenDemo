package first.testng.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngDemo {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Im before test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Im before all methods testNG test");
	}
	
	@Test
	public void firstTest() {
		System.out.println("Im the first testNG test");
	}

	
	@Test
	public void secondTest() {
		System.out.println("Im the second testNG test");
		
	}
}
