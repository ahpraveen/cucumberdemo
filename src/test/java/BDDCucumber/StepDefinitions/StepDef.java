package BDDCucumber.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class StepDef {
	
	private WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SP\\Downloads\\Selenium\\geckodriver.exe");
		driver =  new FirefoxDriver();
	}
	
	@Given("^I am on Google Search Page$")
	public void browseGoogleDotCom(){
		driver.get("https:///www.google.com");
	}
	
	@When("^I search for \"(.*)\"$")
	public void searchFor(String strQuery){
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(strQuery);
		element.submit();		
	}
	
	@When("^enter search key$")
	public void searchFor(DataTable datatable){
		String strSearch = datatable.raw().get(1).get(0).toString();
		System.out.println(strSearch);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(strSearch);
		element.submit();		
	}
	
	@When("^search anything$")
	public void searchAnything(DataTable datatable){
		
		String strSearch = null;
		List<Search> key = new ArrayList<Search>();
		key = datatable.asList(Search.class);
		for (Search search: key)
			strSearch = search.key;
			
		/*String strSearch = datatable.raw().get(1).get(0).toString();
		System.out.println(strSearch);*/
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(strSearch);
		element.submit();		
	}
	
	@Then("^Page title should be \"(.*)\"$")
	public void checkGooglePageTitle(String strTitle){
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.getTitle().toLowerCase().startsWith("cheese");
			}
		});
		assertEquals(strTitle, driver.getTitle());		
	}
	
	@After()
	public void closeBrowser(){
		driver.quit();
	}
	
	
	class Search{
		public String key;
		
		public Search(String Key){
			key = Key;
		}
	}
}