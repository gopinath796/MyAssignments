package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase02 extends BaseClass{

	@BeforeTest
	public void sendData() {
		
		fileName = "TC_02_TestData";
	}
	@Test(dataProvider = "SalesForceExcelIntegration")
	public void SFDC_TC02(String oppName, String amount) throws InterruptedException {
		rewd.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
		WebElement scroll = rewd.findElement(By.xpath("//span[text()='View All Key Deals']"));
		Actions scrollDown = new Actions(rewd);
		scrollDown.scrollToElement(scroll).perform();
		Thread.sleep(2000);
		WebElement viewAllKeyFields = rewd.findElement(By.xpath("//span[text()='View All Key Deals']"));
		rewd.executeScript("arguments[0].click()", viewAllKeyFields);
		Thread.sleep(2000);
		rewd.findElement(By.xpath("//div[text()='New']")).click();
		rewd.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		rewd.findElement(By.xpath("//input[@name='Name']")).sendKeys(oppName);
		rewd.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("29/04/2023");
		rewd.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input-value')])[1]")).click();
		Thread.sleep(3000);
		rewd.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		WebElement dropDown1 = rewd.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input-value')])[2]"));
		rewd.executeScript("arguments[0].click()", dropDown1);
		Thread.sleep(3000);
		rewd.findElement(By.xpath("//span[text()='New Customer']")).click();
		rewd.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input-value')])[3]")).click();
		Thread.sleep(3000);
		rewd.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		rewd.findElement(By.xpath("//input[@placeholder='Search Campaigns...']")).click();
		Thread.sleep(3000);
		rewd.findElement(By.xpath("//span[text()='New Campaign']")).click();
		Thread.sleep(2000);
		rewd.findElement(By.xpath("(//input[@class=' input'])[1]")).sendKeys("New Opp created by Gopinath");
		rewd.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(2000);
		rewd.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String PrintOppName = rewd.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		Thread.sleep(2000);
		if (PrintOppName.equals(oppName)) {
			System.out.println("Opportunity Name is verified and is the correct value");
		} else {
			System.out.println("Opportunity Name is wrong, please check");
		}
	}

}

