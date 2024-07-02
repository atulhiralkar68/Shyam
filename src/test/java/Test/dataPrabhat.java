package Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataPrabhat {
	

	
	public class dataProvider {
		
		 WebDriver driver;
		  @DataProvider(name = "loginData")
		    public Object[][] getData() {
		        return new Object[][] {
		            {"user1", "password1"},
		            {"user2", "password2"},
		            {"user3", "password3"}
		        };
		    }

		    @BeforeClass
		    public void windo() {
		        // Initialize the instance variable driver, not a local variable
		    	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		    	driver = new EdgeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    }
		    @BeforeMethod
		    public void window() {
		        //driver.get("https://ilottery-qa-01.lotteryplus.com/umbraco/login#/content/content/edit/1851?mculture=en-US");
		    	  driver.navigate().to("https://www.lovelocal.in/");
		    
		    }
		    
		    @Test(dataProvider ="loginData")
		    public void samewindow(String username, String password) {
		    	Reporter.log(username);
		    	Reporter.log(password);
				
		    }

	}


}
