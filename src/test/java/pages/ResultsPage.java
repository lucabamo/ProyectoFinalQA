package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utility.LocatorRepository;

public class ResultsPage {

	WebDriver chromeDriver;
	LocatorRepository locators;
	
	public ResultsPage(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
		locators = new LocatorRepository();
		
	}
	
	public void agregarAlCarrito() {	
		WebElement buttonAddToCart = chromeDriver.findElement(By.xpath(locators.getaddToCartXpath()));
		buttonAddToCart.click();
	}
	
	public void continuarComprando() {
		WebDriverWait espera = new WebDriverWait(chromeDriver,20);
		espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators.getcontinueShoppingXpath()))).click();	
	}
	
    public void switchingWindows() {
        String MainWindow = chromeDriver.getWindowHandle();
        Set<String> s1 = chromeDriver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
            	chromeDriver.switchTo().window(ChildWindow);
            }
        }
    }
    
}
