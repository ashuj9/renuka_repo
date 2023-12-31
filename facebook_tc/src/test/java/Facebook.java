import Facebook.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Facebook {
	
	@Given("valid UserName {string}")
	public void valid_user_name(String string) {
	    Login.username_enter(string);
	}

	@Then("UserName entered sucessfully")
	public void user_name_entered_sucessfully() {
	    System.out.println("username entered succesfully");
	}

	@Given("valid Password {string}")
	public void valid_password(String string) {
	    Login.password_enter(string);
	}

	@Then("Password entered sucessfully")
	public void password_entered_sucessfully() {
	    System.out.println("password entered succesfully");
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    Login.login_click();
	}

	@Then("dashboard page is displayed sucessfully")
	public void dashboard_page_is_displayed_sucessfully() {
	    Login.homepage();
	}



	
}
