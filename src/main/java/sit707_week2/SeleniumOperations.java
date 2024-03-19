package sit707_week2;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "D:/Programs/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Tao");
		
	
		WebElement element1 = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element1);
		// Send first name
		element1.sendKeys("Pan");
		
		WebElement element2 = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + element2);
		// Send first name
		element2.sendKeys("0425248160");
		
		WebElement element3 = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element3);
		// Send first name
		element3.sendKeys("taopan2007@gmail.com");
		
		WebElement element4 = driver.findElement(By.id("password"));
		System.out.println("Found element: " + element4);
		// Send first name
		element4.sendKeys("5Sshiwopto!");
		
		WebElement element5 = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + element5);
		// Send first name
		element5.sendKeys("5Sshiw5opto");
		
		
		
		
		
		
		/*
		 *
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		WebElement createAccountButton = driver.findElement(By.cssSelector("[data-testid='account-action-btn']"));
		
		createAccountButton.click();
		/*
		 * Take screenshot using selenium API.
		 */
		byte[] scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		
		
		String filePath = "D:\\temp\\screenshotOfficeWork.png";
	        try (FileOutputStream fos = new FileOutputStream(filePath)) {
	            fos.write(scrFile);
	            System.out.println("Screenshot saved successfully at: " + filePath);
	        } catch (IOException e) {
	            System.err.println("Error saving screenshot: " + e.getMessage());
	        }
		// Sleep a while
		sleep(2);
		
		
		
		// close chrome driver
		//driver.close();	
	}
	
	public static void JBHIFI_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "D:/Programs/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		
	
		// Load a webpage in chromium browser.
		driver.get(url);
		sleep(2);
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement createAccountButton = driver.findElement(By.id("createAccount"));
		
		createAccountButton.click();
		sleep(3);
		
		WebElement element = driver.findElement(By.id("givenName"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Tao");
		
	
		WebElement element1 = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element1);
		// Send first name
		element1.sendKeys("taopan2007558787@gmail.com");
		
		WebElement continueButton = driver.findElement(By.id("continueProxy"));
		
		continueButton.click();
		
		/*
		 * Take screenshot using selenium API.
		 */
		byte[] scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		
		
		String filePath = "D:\\temp\\screenshotJBHIFI.png";
	        try (FileOutputStream fos = new FileOutputStream(filePath)) {
	            fos.write(scrFile);
	            System.out.println("Screenshot saved successfully at: " + filePath);
	        } catch (IOException e) {
	            System.err.println("Error saving screenshot: " + e.getMessage());
	        }

				
		
		// close chrome driver
		//driver.close();	
	}
	
	
}
