package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;
import pageobject.LoginPageObject;

public class ActionUtils {
	
	
	public static void enterUsername(By locator, String username) {
	//	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		DriverFactory.getDriver().findElement(locator).sendKeys(username);
	
	}
	
	public static void enterPassword(By locator, String password) {
	//	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		DriverFactory.getDriver().findElement(locator).sendKeys(password);
	
	}
	
	public static void getError_message(By locator, String error_message) {
	
		DriverFactory.getDriver().findElement(locator).sendKeys(error_message);
	
	}
	
	public static void the_User_enters_with_valid_credentials(By btn_Keep_me_signed_in, 
			By btn_continue, By enterPassword, By enterUsername) {
		
		DriverFactory.getDriver().findElement(enterUsername); // driver factory & Page Object
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(enterPassword);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_signIn_Submit()).click();
		System.out.println(" User should be redirected to the homepage");
		System.out.println(" User should see a welcome message");
		
	}
	
	public static void the_User_enters_with_invalid_credentials(By btn_Keep_me_signed_in, 
			By btn_continue, By enterPassword, By enterUsername) {
		
		DriverFactory.getDriver().findElement(enterUsername); // driver factory & Page Object
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
		DriverFactory.getDriver().findElement(enterPassword);
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_signIn_Submit()).click();
		
		
	}
	
	public static void getTxt_forgot_password(By enterUsername) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterUsername));
		DriverFactory.getDriver().findElement(enterUsername); // driver factory & Page Object
		DriverFactory.getDriver().findElement(LoginPageObject.getBtn_continue()).click();
	
	}
	
	public static void click(By locator) { // Button, forgot password, Change_link
		DriverFactory.getDriver().findElement(locator).click();
	}
	
	public static void isEnabled(By locator) { //  getBtn_Keep_me_signed_in 
		DriverFactory.getDriver().findElement(locator).click();
	}

	

	

}
