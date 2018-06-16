package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.Hooks;

public class AdminLoginPage {

	private WebDriver driver;
	
	//Constructor
	public AdminLoginPage() {
		this.driver = Hooks.driver;
	}
	
	@Given("^User is on TalentCentral Admin$")
	public void openTCAdmin() {
		try {
			driver.get("https://talentcentral.cebglobal.com/admin/login");			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^User enteres \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
	public void enterUsernamePassword(String user, String pass) {
		try {
			System.out.println("Entering username and password");
		    driver.findElement(By.id("j_username")).sendKeys(user);
		    driver.findElement(By.id("j_password")).sendKeys(pass);
		} catch (Exception e) {
		}
	}

	@When("^User clicks on submit button$")
	public void clickSubmitButton() throws Throwable {
		try {
			driver.findElement(By.id("proceed")).click();			
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
			}else{
				System.err.println("Title matcheded");
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
