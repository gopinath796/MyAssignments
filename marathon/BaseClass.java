package marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeOptions copt;
	public EdgeOptions eopt;
	public RemoteWebDriver rewd;
	String fileName;
	
	@Parameters({"browser","url", "username","password"})
	
	@BeforeMethod	
	public void precondition(String browser, String url,String usrName, String Pwd) throws InterruptedException {
		
		ChromeOptions copt = new ChromeOptions();
		EdgeOptions eopt = new EdgeOptions();
		
		copt.addArguments("--disable-notifications");
		eopt.addArguments("--disable-notifications");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			rewd  = new ChromeDriver(copt);
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			rewd  = new EdgeDriver(eopt);
		}	

		
		rewd.manage().window().maximize();
		rewd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Load Salesforce
		rewd.get(url);
		// User name
		rewd.findElement(By.id("username")).sendKeys(usrName);
		// password
		rewd.findElement(By.id("password")).sendKeys(Pwd);
		// Login
		rewd.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		// Click on toggle menu button
		rewd.findElement(By.className("slds-r5")).click();
		Thread.sleep(3000);
		// Click View All
		rewd.findElement(By.xpath("//button[text()='View All']")).click();

	}
	
	@DataProvider(name = "SalesForceExcelIntegration")
	public String[][] createEditLead() throws IOException  {
		
		String[][] question = ReadExcel.question(fileName);
		
		return question;
		
		
	}
	
	 @AfterMethod 
	 public void postcondition() throws InterruptedException { 
		 Thread.sleep(3000);
		 
		 //rewd.close(); }
	 
	 }
}
