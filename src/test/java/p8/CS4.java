package p8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CS4 {
WebDriver driver;
@Given("user enters the testmapp and login")
public void user_enters_the_testmapp_and_login() {
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe" );
	  driver=new ChromeDriver();
	 driver.get("https://10.232.237.143/TestMeApp/"); 
	 driver.findElement(By.id("details-button")).click();
	  driver.findElement(By.id("proceed-link")).click();
	     driver.findElement(By.linkText("SignUp")).click();
	     driver.findElement(By.name("userName")).sendKeys("Lalitha");
	     driver.findElement(By.name("password")).sendKeys("Password123");
	     driver.findElement(By.name("Login")).click();
	     System.out.println("Login Success"); 

}

@When("user search for a product in a search engine")
public void user_search_for_a_product_in_a_search_engine() {
    
}

@Then("user purchases the product")
public void user_purchases_the_product() {

}


}
