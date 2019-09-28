package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	WebDriver driver;
	public void openBrowser() {
		driver = new ChromeDriver();
	}

	public void maximizeBrowserWindow() {
		driver.manage().window().maximize();
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void navigateToApplication(String url) {
		driver.get(url);
	}
	
	public void enterUserID(String loc,String locValue,String userID) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).sendKeys(userID);
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).sendKeys(userID);
		}
	}
	
	public void enterPassword(String loc,String locValue,String password) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).sendKeys(password);
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).sendKeys(password);
		}
	}
	
	public void clickSignInButton(String loc,String locValue) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).click();
		}
		else if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
	}
	
	public String verifyErrorMessage(String locValue) {
		String errMsg = driver.findElement(By.cssSelector(locValue)).getText();
		return errMsg;
	}
	
	public void closeApplication() {
		driver.close();
	}
	
}
