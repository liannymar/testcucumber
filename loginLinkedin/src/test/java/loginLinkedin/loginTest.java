package loginLinkedin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class loginTest {
	
	private WebDriver driver;
	public  String    correo;
	public  String    contrasena;
	public  String    contacto;
	
  @Given("^abrir navegador buscar pagina linkendin (.*)$")
  public void givenAbrirNavegador(String navegador) throws Throwable {
	  
		switch(navegador){
			case "Chrome":{
				    System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
					driver = new ChromeDriver();	
					break;}
			case "InternetExplorer":{
					System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
					driver = new InternetExplorerDriver(); 
					break;}
			default:{
					throw new Exception();
			}
		}
		//Abrir pagina web Linkedin URL
		driver.get("https://www.linkedin.com/");
  }

  @When("^ingreso correo electronico (.*) y contrasena (.*) correctos$")
  public void when(String correo, String contrasena) throws Throwable {
	  //setear email
	  By byElement = By.id("login-email");
	  WebElement webElement = driver.findElement(byElement);
	  Actions selAction = new Actions(driver);
	  selAction.sendKeys(webElement, correo).perform();
	  //setear password
	  byElement = By.id("login-password");
	  webElement = driver.findElement(byElement);
	  Actions selAction2 = new Actions(driver);
	  selAction2.sendKeys(webElement, contrasena).perform();  
  }
  
  @And("^presiono boton inicia sesion$")
  public void andIniciarSesion() throws Throwable {
	  //iniciar sesion
	  By byElement = By.id("login-submit");
	  WebElement webElement = driver.findElement(byElement);
	  Actions selAction3 = new Actions(driver);
	  selAction3.click(webElement).perform();	  
  }

  @And("^busco contacto (.*) de red$")
  public void andBuscarContacto(String contacto) throws Throwable {
	  	 By byElement = By.xpath("//input[starts-with(@id, 'a11y-ember')]");
	  	 WebElement webElement = driver.findElement(byElement);
		 Actions selAction = new Actions(driver);
		 selAction.sendKeys(webElement, contacto).perform();
		 selAction.click(webElement).perform();
		 
		 byElement = By.className("nav-search-button");
		 webElement = driver.findElement(byElement);
		 selAction = new Actions(driver);
		 selAction.clickAndHold(webElement);
  }

  @Then("^como resultado muestra el perfil del contacto$")
  public void thenMostrarPerfil() throws Throwable {
	  	By byElement = By.xpath("//li[starts-with(@id, 'ember')]");
	  	List<WebElement> webElement = driver.findElements(byElement);
	  	Actions selAction = new Actions(driver);
	  	WebElement link = webElement.get(0).findElement(By.xpath("//div"))
	  		.findElement(By.xpath("//a"))
	  		.findElement(By.xpath("//img"));
		selAction.click(link).perform();
  }
}
