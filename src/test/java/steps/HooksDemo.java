package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemo {
	
	// These are global Hooks
	// before the scenario steps this will be executed
	@Before
	public void setup()
	{
		 System.out.println("Open the url");
	}
	
	// After the scenario steps this will be executed
	@After
	public void closebrowser()
	{
		 System.out.println("Close the url");
	}
	
	@Given("user is on eBay HomePgae")
	public void user_is_on_eBay_HomePgae() {
	  System.out.println(" on the ebay page");
	}

	@When("User enter search as toy cars")
	public void user_enter_search_as_toy_cars() {
		  System.out.println(" Enter search input toy car");
	}

	@Then("click on search button")
	public void click_on_search_button() {
		 System.out.println("Click on search button");
	}


}
