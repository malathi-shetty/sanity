package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {

	public static void main(String[] args) {
		String driverPath ="D:\\User\\Automation\\selenium\\driver\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		//System.setProperty("webdriver.gecko.driver", mozilladriverPath); // Firefox
		//System.setProperty("webdriver.edge.driver", edgedriverPath); // Edge
		
		
		// Download Client Library and configure
		// decide which browser to use (Chrome)
		// Donwload chrome driver
		// Set property for chrome driver
		
		ChromeDriver driver = new ChromeDriver() ;
		
//		Dimension dim = new Dimension(360,780);
//		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		By searchBox = By.id("user-name"); // locator strategy 
		WebElement searchBoxElement = driver.findElement(searchBox); // find element with LS
		searchBoxElement.sendKeys("standard_user"); // Action
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		By loginBtn = By.id("login-button");
		WebElement login = driver.findElement(loginBtn);
		login.click();
		
		By dropdown = By.className("product_sort_container");
		WebElement dropElem =  driver.findElement(dropdown);
		Select dropDownSelect = new Select(dropElem);
		dropDownSelect.selectByValue("lohi");
		
		// How to handle dropdown
		
//		searchBoxElement.sendKeys(Keys.ENTER);
		
		//driver.quit();
		
		// 360*780
		

	}

}
