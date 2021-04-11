import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver_linux64/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}

}
