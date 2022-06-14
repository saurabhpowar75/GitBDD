package stepDefination;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;
import pageObject.ProductSearch;


public class StepDefination 
{
	public String title;
	public WebDriver driver;
	public LoginPage lp;
	String act;
	public ProductSearch pc;
	
	@Given("User is able to launch chrome browser")
	public void user_is_able_to_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	   
	}

	@When("User is able to open  URL with {string}")
	public void user_is_able_to_open_url_with(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	   
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		lp.getUN(username);
		lp.getPWD(password);
	  
	}

	@And("Click On Login")
	public void click_on_login() 
	{
		lp.clickon();
		act= driver.getTitle();
	   
	}

	
	
	@Then("Homepage Title Should be {string}")
	public void homepage_title_should_be(String str) {
	    
	   this.title= str;
	   Assert.assertTrue("Passed....",str.equals(act));
	   
	   
	}
	
	@When("User is click on search button")
	public void user_is_click_on_search_button() {
		pc=new ProductSearch(driver);
		pc.searchProduct();
		System.out.println("SuperTech5");
		
	}
	@And("enters product name as {string} and clicks enter")
	public void enters_product_name_as_and_clicks_enter(String string) {
	   pc.enterProduct(string);
	   System.out.println("SuperTech25");
	   
		
	}
	@Then("User should click on product")
	public void user_should_click_on_product() {
		driver.navigate().refresh();
	    pc.clickonProduct();
	    System.out.println("SuperTech");
	    System.out.println("Finserve");
	}
}
