package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPge;
import pages.brwser;

public class stepdef extends brwser{
	LoginPge lgnpage;
	
	@Given("^User is on techfios login pages$")
	public void user_is_on_techfios_login_pages() {
		init();
	}
	
	@When("^User should enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_enter_and(String usernamee, String passwordd) {
		System.out.println("stepsssssssssssssssssssssss");
		lgnpage = PageFactory.initElements(driver, LoginPge.class);
		lgnpage.enter_usernamee(usernamee);
		lgnpage.enter_password(passwordd);
		
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		lgnpage.clck_sgnin();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
	}

}
