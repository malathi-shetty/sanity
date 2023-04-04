package stepdef;



import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks1 {

	@Before
	public void setup() {
		DriverFactory.initiateDriver(null);
	}


	@After //- after the test case
	public void teardown() {
		DriverFactory.closeBrowser();
	}
}
