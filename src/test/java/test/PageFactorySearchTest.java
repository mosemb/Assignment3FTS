package test;

import java.beans.BeanProperty;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePageFactory;

public class PageFactorySearchTest {
	
	static WebDriver driver; 
	GooglePageFactory searchFactory;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testpage() {
	    searchFactory = new GooglePageFactory(driver);
		searchFactory.enterSearch("LuxemBourgh");
		searchFactory.submitBtn();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
