package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;
import logs.Log;

public class AdminLoginPage {

	private WebDriver driver;
	
	//Constructor
	public AdminLoginPage() {
		this.driver = Hooks.driver;
	}
	
	@Given("^User is on TalentCentral Admin$")
	public void openTCAdmin() {
		try {
			Log.info("URL: " + "https://talentcentral.cebglobal.com/admin/login");
			driver.get("https://talentcentral.cebglobal.com/admin/login");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User enteres \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
	public void enterUsernamePassword(String user, String pass) {
		try {
			Log.info("Username and password entered");
		    driver.findElement(By.id("j_username")).sendKeys(user);
		    driver.findElement(By.id("j_password")).sendKeys(pass);
		} catch (Exception e) {
		}
	}

	@When("^User clicks on submit button$")
	public void clickSubmitButton() throws Throwable {
		try {
			driver.findElement(By.id("proceed")).click();	
			Log.info("Submit button clicked");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() {
		try {
			String currentTittle = driver.getTitle();
			
			if(currentTittle.equals("Select Company | TalentCentral")) {
				System.out.println("Title matched");
				//Assert.fail();
				Log.info("Logged in successfully !!!");
			}else{
				System.err.println("Title matcheded");
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
