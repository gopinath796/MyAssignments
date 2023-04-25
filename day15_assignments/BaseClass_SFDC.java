package day15_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass_SFDC {
	public ChromeOptions chop;
	public EdgeOptions edop;
	public RemoteWebDriver rewedr;

	@Parameters({ "browser", "url", "username", "password" })

	@BeforeMethod
	public void beforeMethod(String browser, String url, String usrName, String pWD) throws InterruptedException {
		chop = new ChromeOptions();
		edop = new EdgeOptions();
		chop.addArguments("--disable-notifications");
		edop.addArguments("--disable-notifications");

		if (browser.equalsIgnoreCase("chrome")) {
			rewedr = new ChromeDriver(chop);
		} else if (browser.equalsIgnoreCase("edge")) {
			rewedr = new EdgeDriver(edop);
		}
		rewedr.manage().window().maximize();
		rewedr.get(url);
		rewedr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		rewedr.findElement(By.id("username")).sendKeys(usrName);
		rewedr.findElement(By.id("password")).sendKeys(pWD);
		rewedr.findElement(By.id("Login")).click();
		rewedr.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
		rewedr.findElement(By.xpath("//button[text()='View All']")).click();
		rewedr.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		WebElement Opportunities = rewedr.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		rewedr.executeScript("arguments[0].click()", Opportunities);
		Thread.sleep(3000);
		rewedr.findElement(By.xpath("//div[text()='New']")).click();
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		rewedr.close();
	}

}
