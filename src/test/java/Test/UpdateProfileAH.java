package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;
import javax.xml.xpath.XPath;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class UpdateProfileAH {
	@Test(invocationCount = 3)
		public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		
//		Properties props = new Properties();
//        props.load(new FileInputStream("src/log4j.properties"));
//        PropertyConfigurator.configure(props);
        
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			
		
			driver.get("https://www.naukri.com/");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			//driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("atulhiralkar68@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Atul@1234");
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//i[text()='deleteOneTheme']")).click();
			driver.findElement(By.xpath("//p[text()='Are you sure you want to delete the resume?']/../div/button")).click();
			//File file = new File("./Data/PRABHAT_.SHETTY_ QA.pdf");
//			File file = new File("./data/Atul Hiralkar_QA.pdf");	
//			driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("./data/Atul Hiralkar_QA.pdf");
			File file = new File("./data/Atul_Hiralkar_QA.pdf");	
			//driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("./data/Jayashree-Maharana.pdf");
			driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(file.getAbsolutePath());
			Thread.sleep(10000);	
			driver.navigate().refresh();
			driver.quit();
		}
		}