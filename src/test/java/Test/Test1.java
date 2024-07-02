package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	
	@DataProvider
	public String[][] sendData(){
		String[][] a = {{"admin","manager","null"},{"trainee","trainee","Hi"}};
		return a;
	}
	
	@Test(dataProvider ="sendData")
	public void create_loan(String[] cred) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(cred[0]);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(cred[1]);
		System.out.println(cred[2]);
		Thread.sleep(5000);
		
		driver.close();
	}
}
