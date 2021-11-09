package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {
	
	private WebDriver driver;
	
	@Before   // this is global hook , import from io.cucmber
	// this method will get executed before every test method in step defintion file
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After // import form io.cucumber
	// this method will get executed after every test method in step defintion file
	public void teardown()
	{
		driver.close();
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
}
