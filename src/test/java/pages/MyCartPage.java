package pages;

import org.openqa.selenium.WebDriver;

import utility.LocatorRepository;

public class MyCartPage {


	WebDriver chromeDriver;
	LocatorRepository locators;
	
	public MyCartPage(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
		locators = new LocatorRepository();
		
	}
	
	
}
