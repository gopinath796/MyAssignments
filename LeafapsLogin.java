package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafapsLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
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
		//Enter emailid
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gopinath796@gmail.com");
		//Enter phone no
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9655946046");
		//Click Submit button
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		//Close the browser
		driver.close();

	}

}
