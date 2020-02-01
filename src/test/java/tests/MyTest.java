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
		home = new HomePage(chromeDriver);
		home.validacionFotoPortada();
	}

	public void verificacionLinkContactUsTC17() {
		home = new HomePage(chromeDriver);
		home.validacionLinkContacUs();
	}
	
	public void verificacionIconoCarritoTC6() {
		home = new HomePage(chromeDriver);
		home.validacionIconoCarrito();
	}

	public void verificacionTelefonoTC18() {
		home = new HomePage(chromeDriver);
		home.validacionTelefono();
	}
	
	public void verificacionLinkSignInTC13() {
		home = new HomePage(chromeDriver);
		home.validacionLinkLogin();
	}
	
	public void verificaBarraDeBusqueda10() {
		home = new HomePage(chromeDriver);
		home.validacionBarraDeBusqueda(); 
	}
	
	//@Test
	public void verificacionClickPortadaTC4() {
		home = new HomePage(chromeDriver);
		home.clickFotoPortada();
	}
	
	//@Test
	public void verificaPromocionTC1() {
		home = new HomePage(chromeDriver);
		home.validaPromocion();
		
	}
	//@Test
	public void clickCarritoComprasTC7() {
		home = new HomePage(chromeDriver);
		home.clickCarritoCompras();
		carrito = new MyCartPage(chromeDriver);
		carrito.validaURLCarrito();
	}
	//@Test
	public void agregaProductoAlCarritoTC8() {
		home = new HomePage(chromeDriver);
		home.busquedaVestidosCasuales();
		casualDresses = new CasualDresses(chromeDriver);
		casualDresses.seleccionaVestido();
		resultados = new ResultsPage(chromeDriver);
		resultados.agregarAlCarrito();	
	}
	@Test
	public void buscarAlgoEnLaBarraDeBusquedaTC12() {
		home = new HomePage(chromeDriver);
		home.buscarAlgoEnLaBarraDeBusqueda();
	}
	
	public void darClickEnSingINTC14() {
		home = new HomePage(chromeDriver);
		home.darClickEnSingIn();
	}
	
	public void darClickEnContactUSTC19() {
		home = new HomePage(chromeDriver);
		home.darClickEnContactUS();	
	}
	
	public void verificaBotonPopularTC21() {
		home = new HomePage(chromeDriver);
		home.validacionBotonPopular();
	}
	
	public void verificaBotonBestSellersTC22() {
		home = new HomePage(chromeDriver);
		home.validacionBotonBestSellers();
	}
	
	public void clickEnBotonPopularTC23() {
		home = new HomePage(chromeDriver);
		home.clickEnBotonPopular();
	}
	
	public void clickEnBotonBestSellerTC24() {
		home = new HomePage(chromeDriver);
		home.clickEnBotonBestSeller();
	}
	
	
}
