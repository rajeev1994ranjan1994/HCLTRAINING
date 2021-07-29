package StepDefn;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Step1 {
	@Given("^open chrome and url of the application$")
	public void open_chrome_and_url_of_the_application()  {
	    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("nav-orders")).click();
	
	
	}
	@When("^enter username and password$")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		
	 
	}
}
