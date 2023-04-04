package day4_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafCreateEdit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Enter User name
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click the link
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(5000);
		//Click Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(5000);
		//Click Create Lead tab
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(5000);
		//Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon.co.in");
		//Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopinath");
		//Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Masilamani");
		//Click Submit
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		//Edit
		driver.findElement(By.linkText("Edit")).click();
		//Clear company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		//Update New Company
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Oracle");
		//Click Update
		driver.findElement(By.name("submitButton")).click();
				
		driver.close();


	}

}
