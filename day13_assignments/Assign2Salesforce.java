package day13_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assign2Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-Notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Load Salesforce
		driver.get("https://login.salesforce.com");
		// User name
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		// password
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		// Login
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		// Click on toggle menu button
		driver.findElement(By.className("slds-r5")).click();
		Thread.sleep(3000);
		// Click View All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		// click Sales from App Launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		// Click on Opportunity tab
		WebElement clickopp = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click()", clickopp);
		// Click on New button
		driver.findElement(By.xpath("//div[@title='New']")).click();
		// Close Date
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("4/22/2023");
		// Save
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		// Verify the Alert message
		driver.findElement(By.xpath("//ul[contains(@class,'errorsList slds-list_dotted')]//li[1]")).click();
		
		String error = driver.findElement(By.xpath("//strong[text()='Review the following fields']")).getText();
		if(error.contains("Review the following fields")) {
			System.out.println("Error on Creating Opportunity");
		}
		else {
			System.out.println("Error not appeared Opportunity created");
		}
		driver.close();
		

	}

}
