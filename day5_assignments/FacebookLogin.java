package day5_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		// Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Load the UR
		driver.get("https://en-gb.facebook.com/");
		// Maximize the window
		driver.manage().window().maximize();
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Click on Create New Account button
		driver.findElement(By.linkText("Create new account")).click();
		// Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Nithya");
		// Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Manoj");
		// Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("Ruby@gmail.com");
		// Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("Ruby@123");
		// Handle Date of Birth drop downs
		// Select Date
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("14");
		// Select Month
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		// Select Year
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1990");
		// select Gender
		driver.findElement(By.xpath("//input[@value='1']")).click();

		// Close Browser
		driver.close();

	}

}
