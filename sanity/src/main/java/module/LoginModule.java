package module;

import org.openqa.selenium.JavascriptExecutor;

import factory.DriverFactory;
import pageobject.LoginPageObject;
import utils.ActionUtils;

public class LoginModule extends LoginPageObject {
	
	
	

	/*
	public static void main(String[] args) {
		LoginPageObject.getTxt_username();// method k through get kar rahe hai - method use kar rahe hai
	}
	 */

	// module represents functionality
	// Login module mei jo functionality hai username, password
	
	public void open_amazon_link() {
		DriverFactory.getDriver().get("https://www.amazon.in/");
	}
public void open_login_page() {
		
		((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click()",DriverFactory.getDriver().findElement(LoginPageObject.getBtn_sign_in()) );
	}
	
	public void login(String username, String password) {
		ActionUtils.enterUsername(getTxt_username(), username);
		ActionUtils.enterPassword(getTxt_password(), password);
		ActionUtils.click(getBtn_sign_in());
		ActionUtils.click(getBtn_continue());
		ActionUtils.click(getBtn_signIn_Submit());
		ActionUtils.click(getTxt_forgot_password());
		ActionUtils.click(getTxt_change());
		ActionUtils.click(getBtn_Keep_me_signed_in());
		ActionUtils.the_User_enters_with_valid_credentials(getBtn_Keep_me_signed_in(), getBtn_continue(), getTxt_password(), getTxt_username());
		ActionUtils.the_User_enters_with_invalid_credentials(getBtn_Keep_me_signed_in(), getBtn_continue(), getTxt_password(), getTxt_username());
	
	}
	public void login1( String error_message){
		ActionUtils.getError_message(getError_message(), error_message);
	}
	
	
	

	
	
	
	
	
	
	
/*
		
	
	
	public void clicks_on_the_continue_button() {
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
	//	((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click()",DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()) );
	}
	
	public void error_message(String error_message) {
		DriverFactory.getDriver().findElement(LoginPageObject.getError_message()).sendKeys(error_message);
	}
	
	
	public void the_User_enters_with_valid_credentials(String username, String password){  //valid credentials
		// driver.findElement(By.xpath("")).sendKeys();
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys(username); // driver factory & Page Object
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_password()).sendKeys(password);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_signIn_Submit()).click();
		System.out.println(" User should be redirected to the homepage");
		System.out.println(" User should see a welcome message");
	}
	
	// sendkeys(getTxt_username(), username);
	
	// should we write here any code for welcome & error messages or StepDef statement is enough??
	
	public void the_User_enters_with_invalid_credentials(String username, String password){  //invalid credentials
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys(username); 
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_password()).sendKeys(password);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_signIn_Submit()).click();
	}

	public void the_User_enters_invalid_username_and_valid_password(String username, String password){  //invalid username and valid password
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys(username); 
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_password()).sendKeys(password);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_signIn_Submit()).click();
	}

	public void the_User_enters_valid_username_and_invalid_password(String username, String password){  //valid username and invalid password
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys(username); 
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_password()).sendKeys(password);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_signIn_Submit()).click();
	}

	public void the_User_enters_without_username_and_without_password(){ //empty
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_signIn_Submit()).click();
	}

	public void login_with_forgot_password(String username){ //forgot password redirect to username
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys(username);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_forgot_password()).click();
	}

	public void login_Keep_me_signed_in_checkbox(String username, String password){ //Keep me signed in checkbox
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys(username); 
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_password()).sendKeys(password);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_signIn_Submit()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_Keep_me_signed_in());
	}

	public void login_Change_link(String username){ //Change link
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_username()).sendKeys(username);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(LoginPageObject.getTxt_change()).click();
	}

*/



}
