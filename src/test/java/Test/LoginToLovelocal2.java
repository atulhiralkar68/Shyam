package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class LoginToLovelocal2 {
	@Test
	public static void main (String []args) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	

	driver.get("https://b2c-frontend-release.lovelocal.in/");
	}
}
