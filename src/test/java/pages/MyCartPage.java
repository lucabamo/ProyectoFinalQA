package pages;

import java.net.URL;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import utility.LocatorRepository;

public class MyCartPage {


	WebDriver chromeDriver;
	LocatorRepository locators;
	
	public MyCartPage(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
		locators = new LocatorRepository();	
	}
	
	public void validaURLCarrito() {
		String URLCarrito = "http://automationpractice.com/index.php?controller=order";
		
		String URLActual = chromeDriver.getCurrentUrl();
		
		Assert.assertTrue(URLCarrito.equals(URLActual));
		
	}
}
