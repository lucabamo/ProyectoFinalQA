package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LocatorRepository;

public class CasualDresses {
	
	WebDriver chromeDriver;
	LocatorRepository locators;
	
	public CasualDresses(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
		locators = new LocatorRepository();
		
	}
	
	public void seleccionaVestido() {
		WebElement casualDresses = chromeDriver.findElement(By.xpath(locators.getprimerVestidoXpath()));
		casualDresses.click();		
	}
	
	public void botonTshirts() {
		WebElement tShirt = chromeDriver.findElement(By.xpath(locators.gettShirtsXpath()));
		tShirt.click();
	}
}
