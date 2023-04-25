package day15_assignments;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead_DataProvider extends BaseClass {

	@DataProvider(name = "maker")

	public String[][] createLead() {
		String[][] maker = new String[3][4];

		maker[0][0] = "INFOSYS";
		maker[0][1] = "Nithya";
		maker[0][2] = "Gopi";
		maker[0][3] = "996633";

		maker[1][0] = "INFOVIEW";
		maker[1][1] = "MOSHI";
		maker[1][2] = "Gopi";
		maker[1][3] = "666522";

		maker[2][0] = "WIPRO";
		maker[2][1] = "VIDHU";
		maker[2][2] = "Gopi";
		maker[2][3] = "999411";

		return maker;

	}

	@Test(dataProvider = "maker")
	public void runCreateLead(String compName, String fstName, String lstName, String phNo) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lstName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
		

	}

}
