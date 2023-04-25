package day15_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead_DataProvider extends BaseClass {

	@DataProvider(name = "editData")
	public String[][] editLead() {
		String[][] editData = new String[3][2];

		editData[0][0] = "988465";
		editData[0][1] = "L&T";

		editData[1][0] = "999";
		editData[1][1] = "CTS";

		editData[0][0] = "666";
		editData[0][1] = "TCS";

		return editData;
	}

	@Test(dataProvider = "editData")

	public void runEditLead(String phoneNo, String compName) throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(compName);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(compName)) {
			System.out.println("Lead is editted successfully");
		} else {
			System.out.println("Lead is not editted");
		}
		

	}

}
