package utility;

public class LocatorRepository {
	
	public LocatorRepository() {
		
		
	}
	
	private String fotoPortadaXpath = "//div[@class='row']/a/img[@class='img-responsive']";
	
	private String iconoCarritoXpath = "//div[@class='shopping_cart']/a";
	
	private String barraDeBusquedaXpath = "//form[@id='searchbox']/input[@name='search_query']";
	
	private String botonBuscar = "//form[@id='searchbox']/button[@type='submit']";
	
	private String linkLoginXpath = "//div[@class='header_user_info']/a[@class='login']";
	
	private String linkContactUsXpath = "//div[@id='contact-link']";
	
	private String telefonoXpath = "//div[@class='row']/nav/span[@class='shop-phone']";
	
	
	private String botonWomenXpath = "//ul/li/a[@title='Women']";
	
	private String casualDressesXpath = "//li/ul[@style='display: none;']/li/a[contains(text(),'Casual Dresses')]";
	//div/h5/a[@title='Printed Dress']
	private String primerVestidoXpath = "//div/h5/a[@title='Printed Dress']";
	//	private String primerVestidoXpath = "//div/a[@class='product_img_link']/img[@itemprop='image']";

	private String addToCartXpath = "//div/p[@id='add_to_cart']/button[@type='submit']/span";
	
	private String continueShoppingXpath = "//div/div[@class='button-container']/span/span";
	
	private String tShirtsXpath = "//div/ul/li/a[@title='T-shirts']";
	//div/h5/a[@title='Faded Short Sleeve T-shirts']
	private String firstTshirtXpath = "//div/h5/a[@title='Faded Short Sleeve T-shirts']";

	//private String firstTshirtXpath = "//div/a[@class='product_img_link']/img";
	
	private String CartXpath = "//div[@class='shopping_cart']/a";
		
	private String numeroProductos = "";
	
	public String getLinkLoginXpath() {
		return linkLoginXpath;
	}
	
	public String getLinkContactUsXpath() {
		return linkContactUsXpath;
	}
	
	public String getTelefonoXpath() {
		return telefonoXpath;
	}
	
	public String getFotoPortadaXpath() {
		return fotoPortadaXpath;	
	}
	
	public String getIconoCarrtioXpath() {
		return iconoCarritoXpath;	
	}
	
	public String getBarraDeBusquedaXpath() {
		return barraDeBusquedaXpath;
	}
	
	public String getBotonBuscar() {
		return botonBuscar;
	}
   
	public String getBotonWomenXpath() {
		return botonWomenXpath;	
	}
	
	public String getcasualDressesXpath() {
		return casualDressesXpath;	
	}
	
	public String getprimerVestidoXpath() {
		return primerVestidoXpath;	
	}
	
	public String getaddToCartXpath() {
		return addToCartXpath;	
	}
	
	public String getcontinueShoppingXpath() {
		return continueShoppingXpath;	
	}
	
	public String gettShirtsXpath() {
		return tShirtsXpath;	
	}
	
	public String getfirstTshirtXpath() {
		return firstTshirtXpath;	
	}
	
	public String getCartXpath() {
		return CartXpath;	
	}
	
	public String getNumeroProductos() {
		
		return numeroProductos;
	}
	
	public void setNumeroProductos(String numeroDeProductos) {
		numeroDeProductos = "//span[@id='summary_products_quantity'][contains(text(),'" + numeroDeProductos + "')]";
		
	}
	
}
