package day13_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assign1Salesforce {

	public static void main(String[] args) throws InterruptedException {
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
		// Enter Opportunity Name
		WebElement name = driver.findElement(By.xpath("(//input[@part='input'])[3]"));
		name.sendKeys("Salesforce Automation by Gopinath");
		name.getText();

		// Close Date
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("4/21/2023");
		// Select 'Stage' as Need Analysis
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		// Save
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		// VerifyOppurtunity Name
		String OppNameVerify = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"))
				.getText();
		if (OppNameVerify.equals("Salesforce Automation by Gopinath")) {
			System.out.println("Opportunity Name is verified and its correct");
		} else {
			System.out.println("Opportunity Name is wrong");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
