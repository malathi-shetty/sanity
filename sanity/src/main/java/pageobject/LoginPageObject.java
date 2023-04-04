package pageobject;

import org.openqa.selenium.By;

public class LoginPageObject {
	
	// Locator
	
	private static By btn_sign_in = By.xpath("//span[text()='Sign in']/..");
	private static By txt_username = By.xpath("//div//input[@name='email']");
	private static By btn_continue = By.xpath("//input[@id='continue']");
	private static By txt_password = By.xpath("//div//input[@name='password']");
	private static By txt_change = By.linkText("Change");
	private static By txt_forgot_password = By.linkText("Forgot Password");
	private static By btn_signIn_Submit = By.xpath("//div//input[@id='signInSubmit']");
	private static By btn_Keep_me_signed_in = By.xpath("//div//input[@type='checkbox']");
	private static By error_message = By.xpath("//div[@class='a-alert-content']");
	
	//getters
	// public method any one can access this
	// yaha method banaya hai
	
	
	public static By getBtn_sign_in() {
		return btn_sign_in;
	}
	public static By getTxt_username() {
		return txt_username;
	}
	public static By getBtn_Keep_me_signed_in() {
		return btn_Keep_me_signed_in;
	}
	public static By getTxt_password() {
		return txt_password;
	}
	public static By getBtn_signIn_Submit() {
		return btn_signIn_Submit;
	}
	public static By getBtn_continue() {
		return btn_continue;
	}
	public static By getTxt_change() {
		return txt_change;
	}
	public static By getTxt_forgot_password() {
		return txt_forgot_password;
	}
	public static By getError_message() {
		return error_message;
	}
	
	
	
	
}
