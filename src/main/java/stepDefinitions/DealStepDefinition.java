/*
package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefinition {
 
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
		List<List<String>> data = credentials.raw();
	    driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
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
		
		List<List<String>> dataValues = dealsData.raw();
		 driver.findElement(By.name("title")).sendKeys(dataValues.get(0).get(0));
		 driver.findElement(By.name("amount")).sendKeys(dataValues.get(0).get(1));
		 driver.findElement(By.name("probability")).sendKeys(dataValues.get(0).get(2));
		 driver.findElement(By.name("commission")).sendKeys(dataValues.get(0).get(3));
		
	}
	

	@Then("^user saves the new contact details$")	 
	public void user_saves_the_new_contact_details() {
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//div[@id='dashboard-toolbar']"))).build().perform();
		 driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		 try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
	
	
	@Then("^user close the browser$")
	public void user_close_the_browser() {
		driver.quit();
	}
	
}
*/