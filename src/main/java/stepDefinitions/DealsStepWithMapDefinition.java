package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepWithMapDefinition {
 
	
	// data table with map for parameterization of test cases
	WebDriver driver;
	
	@Given ("^user is already on Login Page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver","F:\\Javainfocampus\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	@When("^title of login page is Cogmento CRM$")
	public void title_of_login_page_is_Cogmento_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
	  Assert.assertEquals("Cogmento CRM", title);
	}

	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)  {
		for(Map<String,String> data  : credentials.asMaps(String.class, String.class)){
			
		
	    driver.findElement(By.name("email")).sendKeys(data.get("username"));
	    driver.findElement(By.name("password")).sendKeys(data.get("password"));
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	    
	}
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		String title = driver.getTitle();
		System.out.println(title);
	  Assert.assertEquals("Cogmento CRM", title);
	  try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
  
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@id='main-nav']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']"))).build().perform();
	    driver.findElement(By.xpath("(//button[@class='ui mini basic icon button'])[position()=4]")).click();
		}
	
	
	
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealsData) {
		
		for(Map<String,String> data  : dealsData.asMaps(String.class, String.class)){
		 driver.findElement(By.name("title")).sendKeys(data.get("title"));
		 driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
		 driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
		 driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
		
		 // saves and create a new deal
		 
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//div[@id='dashboard-toolbar']"))).build().perform();
		 driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		 try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		// move to new deal page
		 
			action.moveToElement(driver.findElement(By.xpath("//div[@id='main-nav']"))).build().perform();
			action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']"))).build().perform();
		    driver.findElement(By.xpath("(//button[@class='ui mini basic icon button'])[position()=4]")).click();
			}
	}
	

	
	
	
	@Then("^user close the browser$")
	public void user_close_the_browser() {
		driver.quit();
	}
	
}
