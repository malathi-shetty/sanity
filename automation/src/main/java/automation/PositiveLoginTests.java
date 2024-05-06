package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoginTestData;

public class PositiveLoginTests extends BaseTestCase {
	@Test
	public void verify_successful_login() {
		LoginModule.login(driver, LoginTestData.VALID_USERNAME, LoginTestData.VALID_PASSWORD);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}
	
	

}
