package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobject.LoginPageObject;

public class LoginModule {
	
	public static void login(WebDriver driver , String username, String password) {
		WebElement searchBoxElement = driver.findElement(LoginPageObject.searchBox); // find element with LS
		searchBoxElement.sendKeys(username); // Action
		
		driver.findElement(LoginPageObject.txtbox_password).sendKeys(password);
		
		By loginBtn = By.id("login-button");
		WebElement login = driver.findElement(loginBtn);
		login.click();
	}
	
	
	public static String getErrorMsg(WebDriver driver) {
		By errorMsg = By.className("error-message-container");
		WebElement errorElem = driver.findElement(errorMsg);
		String errorMsgText = errorElem.getText();
		return errorMsgText;
	}
	

}
