package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePageFactory {
	
	WebDriver driver; 
	
public GooglePageFactory(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "q")
	WebElement txtboxElement; 
	
	@FindBy(name= "btnK")
	WebElement btnElement; 
	
	public void enterSearch(String str) {
		txtboxElement.sendKeys(str);
	}
	
	public void submitBtn() {
		btnElement.submit();
	}

}
