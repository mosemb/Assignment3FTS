import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearch {
	
	public static void main(String []args) {
		
		googleSearch();
	}
	
	public static void googleSearch() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		//String projectPath = System.getProperty("user.dir");
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("New Vision");
		driver.findElement(By.name("btnK")).submit();
		//driver.close();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
	}

}
