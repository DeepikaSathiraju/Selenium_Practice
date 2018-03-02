package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonDemo 
{
	WebDriver driver;

	@Given("^Open Application and Enter the url$")
	public  void  Open_Application_and_Enter_the_url() throws Throwable
	{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
	}
	@When("^Enter Search text$")
	public void Enter_Search_text()
	{
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Aveeno baby");
		driver.findElement(By.className("nav-input")).click();
	}
	@Then("^User should be able to see all items$")
	public void User_should_be_able_to_see_all_items()
	{
		if(driver.getTitle().contains("Aveeno"));
		{
		System.out.println("Page successfully navigated to"+driver.getCurrentUrl().toString());
		System.out.println("Page is loaded successfully");
		}
		  	 
	}

}
