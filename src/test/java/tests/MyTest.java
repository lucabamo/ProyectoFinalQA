package tests;

import org.testng.annotations.Test;

import pages.CasualDresses;
import pages.HomePage;
import pages.MyCartPage;
import pages.ResultsPage;
import pages.TshirtsPage;
import utility.BaseClass;

public class MyTest extends BaseClass{

	HomePage home = new HomePage(chromeDriver);
	CasualDresses casualDresses = new CasualDresses(chromeDriver);
	MyCartPage carrito = new MyCartPage(chromeDriver);
	ResultsPage resultados = new ResultsPage(chromeDriver);
	TshirtsPage playeras = new TshirtsPage(chromeDriver);
	
	//@Test
	public void addTwoItemsToCart() {
		
		home.busquedaVestidosCasuales();
		casualDresses.seleccionaVestido();
		resultados.agregarAlCarrito();
		resultados.continuarComprando();
		casualDresses.botonTshirts();
		playeras.seleccionaTshirt();
		resultados.agregarAlCarrito();
		resultados.continuarComprando();
		playeras.miCarrito();	
	}
	
	public void verificacionFotoPortadaTC3() {
		home.validacionFotoPortada();
	}

	public void verificacionLinkContactUsTC17() {
		home.validacionLinkContacUs();
	}
	
	public void verificacionIconoCarritoTC6() {
		home.validacionIconoCarrito();
	}

	public void verificacionTelefonoTC18() {
		home.validacionTelefono();
	}
	
	public void verificacionLinkSignInTC13() {
		home.validacionLinkLogin();
	}
	
	@Test
	public void verificacionClickPortadaTC4() {
		home = new HomePage(chromeDriver);
		home.clickFotoPortada();
	}
	
	//Comentario de prueba 
	
	
}
