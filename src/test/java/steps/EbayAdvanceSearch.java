package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EbayAdvanceSearch {
	
WebDriver driver;
	
	public EbayAdvanceSearch(CommonSteps  CommonSteps){
		this.driver = CommonSteps.getDriver();
	}
	
	@Given("I am on Ebay Advance Search Page")
	public void i_am_on_Ebay_Advance_Search_Page() {
	   driver.get("https://www.ebay.com/sch/ebayadvsearch?_from=R40&_trksid=p2334524.m570.l1313&_nkw=Iphone+11&_sacat=0&LH_TitleDesc=0&_odkw=iphone+11&_osacat=0");
	}

	@When("I Advance search an item")
	public void i_Advance_search_an_item(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		//dataTable.cell(row, column);
		//row 0 is headers, our data is in row 1 and it has columns 0,1,2,3,4...
		
		driver.findElement(By.xpath("//*[@id='adv_search_from']/descendant::input[2]"))
		.sendKeys(dataTable.cell(1, 0));
		
		driver.findElement(By.xpath("//*[@id='adv_search_from']/descendant::input[3]"))
		.sendKeys(dataTable.cell(1, 1));
		driver.findElement(By.xpath("//*[@id='adv_search_from']/descendant::input[9]"))
		.sendKeys(dataTable.cell(1, 2));
		driver.findElement(By.xpath("//*[@id='adv_search_from']/descendant::input[10]"))
		.sendKeys(dataTable.cell(1, 3));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='searchBtnLowerLnk']")).click();
		
		
		
		
		
		
		
		
	}

}
