package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {
	
	static WebElement element = null;
	
	public static WebElement text_box(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		
		return element;
		
	}
	
	public static WebElement button(WebDriver driver) {
		
		element = driver.findElement(By.name("btnK"));
		
		return element;
		
	}
	
	
	

}
