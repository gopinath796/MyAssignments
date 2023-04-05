package day5_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Enter FirstName
		driver.findElement(By.id("firstNameField")).sendKeys("Ronald");
		//Enter LastName
		driver.findElement(By.id("lastNameField")).sendKeys("Tony");
		//Enter FirstName(Local)
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Tamil");
		//Enter LastName(Local)
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("English");
		//Enter Department
		driver.findElement(By.name("departmentName")).sendKeys("M.Tech");
		//Enter Description
		driver.findElement(By.name("description")).sendKeys("I have done my final year projects in college");
		//Enter your email
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Tester123@gmail.com");
		//Select State/Province
		Select state = new Select (driver.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByVisibleText("Arizona");
		//Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//Clear Description
		driver.findElement(By.id("updateContactForm_description")).clear();
		//Fill Important Note
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Thank you for Updating");
		//Click on update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Get Title of the Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		//Close Browser
		driver.close();

	}

}
