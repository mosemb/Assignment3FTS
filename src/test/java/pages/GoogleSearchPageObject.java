package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	static WebDriver driver = null;
	
	By text_box = By.name("q");
	By btn  = By.name("btnK");
	
	public GoogleSearchPageObject(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void search(String txt) {
		driver.findElement(text_box).sendKeys(txt);
		
	}
	
	public void clickSearc() {
		
		driver.findElement(btn).submit();
	}
	
	
	

}
