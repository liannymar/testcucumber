package loginLinkedin;

import org.junit.Assert;
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

public class loginTestFail {
	
	private WebDriver driver;
	public  String    correo;
	public  String    contrasena;
	public  String    contacto;
	
  @Given("^se abre navegador buscar pagina linkendin (.*)$")
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

  @When("^ingreso correo electronico (.*) no registrado y contrasena (.*)$")
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
  
  @And("^se presiona boton inicia sesion$")
  public void and() throws Throwable {
	  //iniciar sesion
	  By byElement = By.id("login-submit");
	  WebElement webElement = driver.findElement(byElement);
	  Actions selAction3 = new Actions(driver);
	  selAction3.click(webElement).perform();	  
  }

  @Then("^como resultado muestra mensaje de error$")
  public void then() {
	  By byElement = By.id("session_key-login-error");
	  WebElement webElement = driver.findElement(byElement);
      Assert.assertEquals("Vaya, no reconocemos esa dirección de correo electrónico. Vuelve a intentarlo.", webElement.getText());
  } 

}
