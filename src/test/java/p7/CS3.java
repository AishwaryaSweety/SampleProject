package p7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CS3 {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe" );
		  driver=new ChromeDriver();
		 driver.get("https://10.232.237.143/TestMeApp/"); 
		 driver.findElement(By.id("details-button")).click();
		  driver.findElement(By.id("proceed-link")).click();
		     driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters {string} and {string} and clicks submit button")
	public void user_enters_and_and_clicks_submit_button(String string, String string2) {
		    driver.findElement(By.name("userName")).sendKeys(string);
		    driver.findElement(By.name("password")).sendKeys(string2);
		    driver.findElement(By.name("Login")).click();
		    System.out.println("Login Success"); 
	}

	@Then("user does successful login")
	public void user_does_successful_login() {
		System.out.println("Successful login");
	   
	}


}
