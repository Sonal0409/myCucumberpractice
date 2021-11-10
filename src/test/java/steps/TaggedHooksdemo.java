package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooksdemo {
	
	
	// there are 4 global hooks and we have given orders to them
	
	@Before(order=0)
	public void setup()
	{
		 System.out.println("global hook with order 0");
	}
	
	// After the scenario steps this will be executed
	@After(order=0)
	public void closebrowser()
	{
		 System.out.println("globalhook close for order 0");
	}
	
	@Before(order=1)
	public void setup2()
	{
		 System.out.println("global hook for order 1");
	}
	
	// After the scenario steps this will be executed
	@After(order=1)
	public void closebrowser2()
	{
		 System.out.println("globalhook close for order 1");
	}
	
	
	@Before("@link")
	public void setup1()
	{
		System.out.println("to be executed fore this tag only");
	}

	@After("@link")
	public void close()
	{
		System.out.println("to be executed fore this tag only");
	}
	@Given("user is on  HomePgae")
	public void user_is_on_HomePgae() {
		System.out.println("I am on homepage");
	}

	@When("User click on the link")
	public void user_click_on_the_link() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on link");
	}

	@Then("navigate to new page")
	public void navigate_to_new_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on new page");
	}
}
