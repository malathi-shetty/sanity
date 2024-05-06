package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoginTestData;

public class NegativeLoginTestCases extends BaseTestCase {
	// assertions
	
		@Test
		public void verify_valid_username_invalid_password () {
			LoginModule.login(driver, LoginTestData.VALID_USERNAME, "abcd");
			Assert.assertTrue(LoginModule.getErrorMsg(driver).
					contains("Username and password do not match any user in this service"), 
					"failed due to msg not match");
			// expected , actual
		}
		
		@Test
		public void verify_invalid_username_valid_password () {
			LoginModule.login(driver, "sdasd", LoginTestData.VALID_PASSWORD);
			Assert.assertTrue(LoginModule.getErrorMsg(driver).
					contains("Username and password do not match any user in this service"));
			
		}
		
		@Test
		public void verify_no_username_valid_password () {
			LoginModule.login(driver, "", LoginTestData.VALID_PASSWORD);
			Assert.assertTrue(LoginModule.getErrorMsg(driver).
					contains("Username is required"));
		}
		
		@Test
		public void verify_valid_username_no_password () {
			LoginModule.login(driver, LoginTestData.VALID_USERNAME, "");
			Assert.assertTrue(LoginModule.getErrorMsg(driver).
					contains("Password is required"));
		}
		
		@Test
		public void verify_invalid_username_invalid_password () {
			LoginModule.login(driver, "abcd", "abcd");
			Assert.assertTrue(LoginModule.getErrorMsg(driver).
					contains("Username and password do not match any user in this service"));
		}

}
