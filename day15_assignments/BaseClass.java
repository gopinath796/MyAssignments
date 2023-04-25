package day15_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public RemoteWebDriver driver;
	@Parameters ({"browser", "url","username", "password"})
	
	@BeforeMethod
	public void precondition(String browser,String url, String usrName, String pWD)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver  = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			driver  = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(usrName);
		driver.findElement(By.id("password")).sendKeys(pWD);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}

	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}

}
