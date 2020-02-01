package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LocatorRepository;

public class TshirtsPage {

	WebDriver chromeDriver;
	LocatorRepository locators;
	
	public TshirtsPage(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
		locators = new LocatorRepository();
		
	}
	
	public void seleccionaTshirt() {

		WebElement tShirt = chromeDriver.findElement(By.xpath(locators.getfirstTshirtXpath()));
		tShirt.click();
		
	}
	
	public void miCarrito() {
		WebElement cart = chromeDriver.findElement(By.xpath(locators.getCartXpath()));
		cart.click();
	}
	
}
