package factory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	static WebDriver driver = null;
	public static WebDriver initiateDriver(By locator){ // before hook
		try {
			WebDriverManager.chromedriver().setup(); // driver setup karega
		//	driver = new ChromeDriver(); // chromedriver return karega
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			driver = new ChromeDriver(options);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign in']/..")));
			
			WebDriverWait wait1 = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
				wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void closeBrowser() {
		try {
			driver.close();
			driver.quit();

		} catch (Exception e) {

		}
	}


}
