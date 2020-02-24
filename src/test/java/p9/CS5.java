package p9;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CS5 {
@Given("user navigates to URL")
		public void user_navigates_to_URL() {
		  System.out.println("Test me app signup page");
		}
@Given("enters {string} and {int}")
		public void enters_and(String username, Integer Pwd) {
			System.out.println("User id="+username);
			System.out.println("Password="+Pwd);
		  
		}
@When("user click on signup button")
		public void user_click_on_signup_button() {
			System.out.println("Click on the signup button");
		   
		}
@Then("the welcome page is displayed")
		public void the_welcome_page_is_displayed() {
		   System.out.println("The Welcome page is displayed");
		}@Given("user enters user name")
		public void user_enters_user_name() {
		 System.out.println("user enter username");
		}
@Given("user enters password")
		public void user_enters_password() {
			System.out.println("user enter password");
		   
		}
@When("user clicks on login button")
		public void user_clicks_on_login_button() {
			System.out.println("clcick on login button");
		  
		}
}



