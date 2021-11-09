package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHomePage {
	WebDriver driver;
	
	public EbayHomePage(CommonSteps  CommonSteps){
		this.driver = CommonSteps.getDriver();
	}
	
	@Given("I am on Ebay Homepage")
	public void i_am_on_Ebay_Homepage() {
		
		System.out.println("Click on advance link");
	}

	@When("I click on advance link")
	public void i_click_on_advance_link() {
		System.out.println("Click on advance link");
	}

	@Then("I navigate to Advance search Page")
	public void i_navigate_to_Advance_search_Page() {
	  
		System.out.println("navigate to search Page");
	}
	
	@Given("I am on Ebay Home Page")
	public void i_am_on_Ebay_Home_Page() {
		
		driver.get("https://www.ebay.com/");
		String title = driver.getTitle();
		
	    System.out.println(title);
	}

	@When("I search for {string}")
	public void i_search_for_Iphone(String str1) {
		driver.findElement(By.id("gh-ac")).sendKeys(str1);
		driver.findElement(By.id("gh-btn")).click();
		
	    
	}

	@Then("I validate atleast {int} search items present")
	public void i_validate_atleast_search_items_present(int count) {
	   String itemcount = driver.findElement(By.xpath("//*[@class='srp-controls__row-cells']/descendant::span[1]")).getText().trim();
	System.out.println(itemcount);
	
	String itemcount2 = itemcount.replace(",", "");
	// convert string to integer
	
	int Integervalue = Integer.parseInt(itemcount2);
	if(Integervalue>count)
	{
		System.out.println("More than 1000 results shown");
	}
	else
	{
		System.out.println("Less than 1000 results shown");
	}
	
	
	}
	
	@When("I search for {string} from {string} category")
	public void i_search_for_from_category(String item, String item2) throws InterruptedException {
	 driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(item);
	 driver.findElement(By.xpath("//select[@id='gh-cat']")).click();
	 List<WebElement> li = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
	for(WebElement temp : li)
	{
		if(temp.getText().trim().toLowerCase().equals(item2.toLowerCase()))
		{
			temp.click();
			break;
		}
			
	}
	Thread.sleep(3000);
	driver.findElement(By.id("gh-btn")).click();
	
	}
	
	
	@When("I Click on a {string}")
	public void i_Click_on_a(String linkname) throws InterruptedException {
	
		driver.findElement(By.linkText(linkname)).click();
		Thread.sleep(2000);
	}

	@Then("I validate the page navigated to {string} and title contains {string}")
	public void i_validate_the_page_navigated_to_and_title_contains(String url, String title) {
	   
		String acturl = driver.getCurrentUrl();

		String actualtitle= driver.getTitle();
		if(acturl.equals(url))
		{
			System.out.println("URL is same");
		}
		else
		{
			System.out.println("URL is not same");
		}
		
		if(actualtitle.contains(title))
		{
			System.out.println("title is same");
		}
		else
		{
			System.out.println("title is not same");
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
