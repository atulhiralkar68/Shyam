package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Flipcart {

@Test

	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//WebDriverWait wait = new WebDriverWait(driver, 10);


		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);

	}
}
