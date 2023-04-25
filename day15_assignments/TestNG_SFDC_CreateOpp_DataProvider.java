package day15_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_SFDC_CreateOpp_DataProvider {
	
	public class TestNG_SalesForce_CreateOpp_DataProvider extends BaseClass_SFDC{
		@DataProvider(name="oppName")
			public String[][] oppName(){
				String[][] oppName = new String[3][1];
					oppName[0][0] = "Salesforce Automation by LEO";
				
					oppName[1][0] = "Salesforce Automation by PANTHER";
				
					oppName[2][0] = "Salesforce Automation by COBRA";
					
				return oppName;
		}

		@Test(dataProvider="oppName")
		public void testNG_SalesForce1(String oppName) throws InterruptedException {

			WebElement name = rewedr.findElement(By.xpath("(//input[@part='input'])[3]"));
			name.sendKeys("Salesforce Automation by Gopinath");
			name.getText();

			// Close Date
			rewedr.findElement(By.xpath("//label[text()='Close Date']/following::input")).sendKeys("4/21/2023");
			// Select 'Stage' as Need Analysis
			rewedr.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
			Thread.sleep(3000);
			rewedr.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
			// Save
			rewedr.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
			// VerifyOppurtunity Name
			String OppNameVerify = rewedr.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"))
					.getText();
			if (OppNameVerify.equals("Salesforce Automation by Gopinath")) {
				System.out.println("Opportunity Name is verified and its correct");
			} else {
				System.out.println("Opportunity Name is wrong");
			}
			Thread.sleep(2000);
			rewedr.close();

		}

	}
}