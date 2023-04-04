package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.LoginModule;

public class Sanitystep {
	
	LoginModule login = new LoginModule();
	@Given("User open amazon site")
	public void User_open_amazon_site() {
		login.open_amazon_link();
	    System.out.println(" User open amazon site");
	    
	}
	@When("User open login page")
	public void User_open_login_page() {
		login.getBtn_sign_in();
	System.out.println("User open login page");
	    
	}
	//valid credentials
	@When("the User enters {string} and {string}")
	public void the_User_enters(String username, String password) {
	//	login.the_User_enters_with_valid_credentials(username, password);
		login.getTxt_username() ;
		login.getTxt_password();
	 System.out.println(" User provide valid credentials" + " " + username );
	    
	}
	@When("the User clicks on the continue button")
	public void the_User_clicks_on_the_Continue_button() {
	//login.clicks_on_the_continue_button();
		login.getBtn_continue();
	  System.out.println(" User clicks on the Continue button");
	    
	}
	@Then("the User should be redirected to the homepage")
	public void the_User_should_be_redirected_to_the_homepage() {
	 System.out.println(" User should be redirected to the homepage");
	    
	}
	@Then("the User should see a welcome message")
	public void the_User_should_see_a_welcome_message() {

	     System.out.println(" User should see a welcome message");
	}
	//error_message-invalid credentials
	
	@When("the User enters invalid credentials {string} and {string}")
	public void the_User_enters_invalid_credentials_and(String username, String password) {
		//login.the_User_enters_with_invalid_credentials(username, password);
		login.getTxt_username();
		login.getTxt_password();
	    System.out.println(" User provide invalid credentials" + " " + username + " " + password);
	}
	@When("the User clicks the continue button")
	public void the_User_clicks_the_Continue_button() {
	     System.out.println("User clicks on the Continue button");
	}
	@Then("the User should see an error message {string}")
	public void the_user_should_see_an_error_message(String error_message) {
	    System.out.println(" User should see an error message" + " " + error_message);
	}
	//Forgot Password
	@When("the User clicks on the {string} link")
	public void the_user_clicks_on_the_link(String Forgot_Password) {
	    System.out.println(" User clicks on the link" + " " + Forgot_Password );
	}

	@When("the User enters their email address {string} either email or mobile phone number")
	public void the_user_enters_their_email_address_either_email_or_mobile_phone_number(String username) {
	    System.out.println(" User enters either email or mobile phone number" + " " + username);
	}

	@When("the User clicks on the {string} button")
	public void clicks_on_the_button(String Continue) {
	    System.out.println(" User clicks on the button" + " " + Continue);
	}

	@Then("the User should receive an email with instructions to reset their password")
	public void the_user_should_receive_an_email_with_instructions_to_reset_their_password() {
	    System.out.println(" User receive an email with instructions to reset their password");
	}

	@Then("the User should be redirected to the login page")
	public void the_user_should_be_redirected_to_the_login_page() {
	    System.out.println(" User redirected to the login page");
	}
	//Keep me signed in checkbox
	@When("the User selects the {string} checkbox")
	public void the_user_selects_the_checkbox(String Keep_me_signed_in) {
	    System.out.println(" user selects the checkbox" + " " + Keep_me_signed_in);
	}
	@When("the User clicks on the Sign In button")
	public void the_user_clicks_on_the_sign_in_button() {
	    System.out.println(" User clicks on the Sign In button");
	}
	@Then("the User should be logged in")
	public void the_user_should_be_logged_in() {
	    System.out.println(" User logged in");
	}
	@Then("the User should see the {string} message")
	public void the_user_should_see_the_message(String username) {
	    System.out.println(" User see the message" + " " + username);
	}
	//Change link
	@When("the User enters username and navigates to password page")
	public void the_user_enters_username_and_navigates_to_password_page() {
	     System.out.println(" User enters username and navigates to password page");
	}
	@When("the User clicks on the {string} link on Password page")
	public void the_user_clicks_on_the_link_on_password_page(String Change) {
	     System.out.println(" clicks on the change link on Password page" + " " + Change);
	}
	@Then("the User should be redirected to username Page")
	public void the_user_should_be_redirected_to_username_page() {
	     System.out.println(" User redirected to username Page");
	}
	@Then("the User should be able to change the {string}")
	public void the_user_should_be_able_to_change_the(String username) {
	     System.out.println(" User able to change the data" + " " + username);
	}
	
	@Then("the User should be redirected to {string} Page")
	public void the_user_should_be_redirected_to_page(String Authentication_required) {
	     System.out.println(" User Should be able to redirect to " + " " + Authentication_required);
	}

	@Then("the User gets an OTP on either email or mobile phone number")
	public void the_user_gets_an_otp_on_either_email_or_mobile_phone_number() {
	     System.out.println(" the User gets an OTP on either email or mobile phone number");
	}

	@Then("the User should be able to {string}")
	public void the_user_should_be_able_to(String OTP) {
	     System.out.println(" User able to enter the otp" + " " + OTP);
	}

	@Then("the User clicks on the {string} button and gets navigated to Homepage")
	public void the_user_clicks_on_the_button_and_gets_navigated_to_homepage(String Continue) {
	     System.out.println(" User clicks on the button and gets navigated to Homepage" + " " + Continue);
	} 
	

@Then("if the User clicks on {string}")
public void if_the_user_clicks_on(String Resend_OTP) {
     System.out.println(" User click on " + " " + Resend_OTP);
}

@Then("Alert message is seen as on sent {string}")
public void alert_message_is_seen_as_on_sent(String Alert_message_for_new_otp_send) {
     System.out.println("A new OTP has been sent to your mobile number" + " " + Alert_message_for_new_otp_send);
}

@Then("User waits for a certain amount of time until the new OTP code is received.")
public void user_waits_for_a_certain_amount_of_time_until_the_new_otp_code_is_received() {
     System.out.println("User_waits_for_a_certain_amount_of_time_until_the_new_otp_code_is_received");
}

@When("User enters an invalid OTP code multiple times until the maximum attempts are reached.")
public void user_enters_an_invalid_otp_code_multiple_times_until_the_maximum_attempts_are_reached() {
     System.out.println(" User enters an invalid OTP code multiple times until the maximum attempts are reached.");
}

@When("Alert message is seen for user to wait {string}")
public void alert_message_is_seen_for_user_to_wait(String Alert_message_multiple_times) {
     System.out.println(" Please_wait_46_second_before_requesting_a_new_One_Time_Password_(OTP)" + " " + Alert_message_multiple_times);
}

@When("Timer ends user sees a new alert message as {string}")
public void timer_ends_user_sees_a_new_alert_message_as(String Alert_message_multiple_times_wait_over) {
     System.out.println( "You_can_now_request_a_new_code_if_needed." + " " + Alert_message_multiple_times_wait_over);
}





}
