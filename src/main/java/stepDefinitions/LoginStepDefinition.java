package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/*

public class LoginStepDefinition {
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
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password)  {
	    driver.findElement(By.name("email")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
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
  
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@id='main-nav']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and text()='Contacts']"))).build().perform();
	    driver.findElement(By.xpath("(//button[@class='ui mini basic icon button'])[position()=2]")).click();
		}
	

	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
		 driver.findElement(By.name("first_name")).sendKeys(firstname);
		 driver.findElement(By.name("last_name")).sendKeys(lastname);
		 driver.findElement(By.name("position")).sendKeys(position);
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
	 
	
	@Then("^Close the browser$")
	public void Close_the_browser() {
		driver.quit();
	}
	
}
*/