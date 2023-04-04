package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafCreateEdit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon.co.in");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopinath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Masilamani");
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
