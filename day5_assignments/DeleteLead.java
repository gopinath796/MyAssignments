package day5_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Enter User name
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click the link
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(5000);
		//Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click phone
		driver.findElement(By.xpath("//span[contains(span,'Phone')]")).click();
		//Click phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		//click Find Leads
		WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		//Capture lead ID of First Resulting lead
		//String Leadno = leadId.getText();
		 leadId.click();
		
		

	}

}
