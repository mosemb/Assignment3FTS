package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObject;


public class GoogleSeachPageObjectTest {
	
	static WebDriver driver = null;
	
	public static void main(String[]args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		
		GoogleSearchPageObject searchObj = new GoogleSearchPageObject(driver);
		
		driver.get("https://www.google.com/");
		searchObj.search("Uganda");
		searchObj.clickSearc();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}
	
}
