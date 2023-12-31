package fb_tcs;




import Facebook.Driver;
import Facebook.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class fb {
	
	@Given("URL : {string}")
	public void url(String string) {
        System.out.println("Url id enterde sucessfully");
	}

	@Then("On search FaceBook Login page should be displayed")
	public void on_search_face_book_login_page_should_be_displayed() {
	   Driver.WebDriver();
	   System.out.println("Facebook login page should be dispalyed");
	}

	@Given("username {string}")
	public void username(String string) {
	    Login.username_enter(string);
	    System.out.println("username entered succesfully");
	}

	@Then("username entered succesfully")
	public void username_entered_succesfully() {
		   System.out.println("username entered succesfully");
	}

	@Given("password {string}")
	public void password(String string) {
	    Login.password_enter(string);
	}

	@Then("password entered successfully")
	public void password_entered_successfully() {
		   System.out.println("password entered succesfully");
	}

	@Then("click Login Button")
	public void click_login_button() {
	    Login.login_click();
	    System.out.println("Login succesfully");
	}

	@Then("FaceBook home page should be displayed")
	public void face_book_home_page_should_be_displayed() {
		   System.out.println("FaceBook home page should be displayed");
	}

	@Then("{string} should be shown")
	public void should_be_shown(String string) {
		   System.out.println("Invalid username");
	}



	

}
