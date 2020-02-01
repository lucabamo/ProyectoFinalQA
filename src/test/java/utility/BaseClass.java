package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseClass {

	public WebDriver chromeDriver;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\Luis Bacasehua\\Documents\\automation"
				+ "\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		
		//chromeDriver.get("https://www.flipkart.com");

		chromeDriver.manage().window().maximize();

		chromeDriver.get("http://automationpractice.com");
		//chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//chromeDriver = new ChromeDriver();
		//driverChrome.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {		
		chromeDriver.close();
		chromeDriver.quit();
	}
	
	public WebDriver getDriverChrome() {
		return chromeDriver;		
	}
}
