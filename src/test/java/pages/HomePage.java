package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import utility.LocatorRepository;

public class HomePage {

	WebDriver chromeDriver;
	LocatorRepository locators = new LocatorRepository();

	public HomePage(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
	}
	
	
	public void busquedaVestidosCasuales() {
		
		Actions action = new Actions(chromeDriver);
		
		WebElement botonWomen = chromeDriver.findElement(By.xpath(locators.getBotonWomenXpath()));
		
		action.moveToElement(botonWomen).
		moveToElement(chromeDriver.findElement(By.xpath(locators.getcasualDressesXpath()))).click().build().perform();
		
	}
	
	public void validacionFotoPortada() {
		WebElement fotoPortada = chromeDriver.findElement(By.xpath(locators.getFotoPortadaXpath()));
		
		Assert.assertTrue(fotoPortada.isDisplayed());
	}
	
	public void validacionBotonPopular() {
		WebElement popular = chromeDriver.findElement(By.xpath(locators.getBotonPopularXpath()));
		
		Assert.assertTrue(popular.isDisplayed());
	}
	
	public void validacionBotonBestSellers() {
		WebElement bestSellers = chromeDriver.findElement(By.xpath(locators.getBotonBestXpath()));
		
		Assert.assertTrue(bestSellers.isDisplayed());
	}
	
	
	public void validacionIconoCarrito() {
		WebElement iconoCarrito = chromeDriver.findElement(By.xpath(locators.getIconoCarrtioXpath()));
		
		Assert.assertTrue(iconoCarrito.isDisplayed());
	}
	
	public void validacionBarraDeBusqueda() {
		WebElement barraBusqueda = chromeDriver.findElement(By.xpath(locators.getBarraDeBusquedaXpath()));
		
		Assert.assertTrue(barraBusqueda.isDisplayed());
	}
	
	public void validacionLinkLogin() {
		WebElement linkLogin = chromeDriver.findElement(By.xpath(locators.getLinkLoginXpath()));
		
		Assert.assertTrue(linkLogin.isDisplayed());
	}
	
	public void validacionLinkContacUs() {
		WebElement barraBusqueda = chromeDriver.findElement(By.xpath(locators.getBarraDeBusquedaXpath()));
		
		Assert.assertTrue(barraBusqueda.isDisplayed());
	}
	
	public void validacionTelefono() {
		WebElement barraBusqueda = chromeDriver.findElement(By.xpath(locators.getBarraDeBusquedaXpath()));
		
		Assert.assertTrue(barraBusqueda.isDisplayed());
	}
	
	public void validaPromocion() {
		WebElement promocion = chromeDriver.findElement(By.xpath(locators.getPromocionesXpath()));
		
		Assert.assertTrue(promocion.isDisplayed());
	}
	
	public void clickFotoPortada() {
		WebElement fotoPortada = chromeDriver.findElement(By.xpath(locators.getFotoPortadaXpath()));
		
		String urlActual = chromeDriver.getCurrentUrl();
		
		fotoPortada.click();
		
		String urlDespuesClick = chromeDriver.getCurrentUrl();
		
		//Aquí validamos que haya redirigido al usuario a otra página, si el URL se mantiene igual, entonces 
		//el usuario no fue redirigido a ninguna parte y el botón no sirvió
		Assert.assertFalse(urlActual.equals(urlDespuesClick));
		
	}
	
	public void clickCarritoCompras() {
		WebElement iconoCarrito = chromeDriver.findElement(By.xpath(locators.getIconoCarrtioXpath()));
		iconoCarrito.click();
		
	}
	
	public void buscarAlgoEnLaBarraDeBusqueda() {
		WebElement barraBusqueda = chromeDriver.findElement(By.xpath(locators.getBarraDeBusquedaXpath()));
		barraBusqueda.sendKeys("Dresses");
		WebElement botonBusqueda = chromeDriver.findElement(By.xpath(locators.getBotonBuscar()));
		botonBusqueda.click();
		
	}
	
	public void darClickEnSingIn() {
		String URLEsperada = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		WebElement linkLogin = chromeDriver.findElement(By.xpath(locators.getLinkLoginXpath()));
		linkLogin.click();
		String URLActual = chromeDriver.getCurrentUrl();
		Assert.assertTrue(URLEsperada.equals(URLActual));
		
	}
	
	public void darClickEnContactUS() {
		String URLEsperada = "http://automationpractice.com/index.php?controller=contact";
		WebElement linkContact = chromeDriver.findElement(By.xpath(locators.getLinkContactUsXpath()));
		linkContact.click();
		String URLActual = chromeDriver.getCurrentUrl();
		Assert.assertTrue(URLEsperada.equals(URLActual));
	}
	
	public void clickEnBotonPopular() {
		WebElement popular = chromeDriver.findElement(By.xpath(locators.getBotonPopularXpath()));
		popular.click();
		WebElement productoPopular = chromeDriver.findElement(By.xpath(locators.getfirstTshirtXpath()));
		Assert.assertTrue(productoPopular.isDisplayed());
		
	}
	
	public void clickEnBotonBestSeller() {
		WebElement bestSeller = chromeDriver.findElement(By.xpath(locators.getBotonPopularXpath()));
		bestSeller.click();
		WebElement productoBestSeller = chromeDriver.findElement(By.xpath(locators.getfirstTshirtXpath()));
		Assert.assertTrue(productoBestSeller.isDisplayed());
	
	}
	
	
	
}
