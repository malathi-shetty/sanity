package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import factory.DriverFactory;
import pageobject.LoginPageObject;


public class CaptureScreenshot {
	
	public static void main(String[] args, File TakesScreenshot) throws IOException{
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    ((JavascriptExecutor)driver).executeScript("arguments[0].click()",DriverFactory.getDriver().findElement(LoginPageObject.getBtn_sign_in()) );
    driver.findElement(LoginPageObject.getTxt_username()).sendKeys("8097231050"); // driver factory & Page Object
    driver.findElement(LoginPageObject.getBtn_continue()).click();
    driver.findElement(LoginPageObject.getTxt_password()).sendKeys("8097231050");
    driver.findElement(LoginPageObject.getBtn_signIn_Submit()).click();
	System.out.println(" User should be redirected to the homepage");
	System.out.println(" User should see a welcome message");
    //driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");

    
    
   // TakesScreenshot ts = (TakesScreenshot) driver;
    //File source = ts.getScreenshotAs(OutputType.FILE);
   // FileUtils.copyFile(source,new File("./Screenshots/facebook.png")); //Getting error at this line

  //Take the screenshot
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
  //Copy the file to a location and use try catch block to handle exception
    try {
    	FileUtils.copyFile(TakesScreenshot, new File("D:\\User\\git\\repository\\sanity\\src\\main\\java\\screenshot"));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
    driver.quit();

    }


}
