package marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase01 extends BaseClass {
	
	@BeforeTest
	
	public void sendData() {
		
		fileName = "TC_01_TestData";
	}

	@Test(dataProvider = "SalesForceExcelIntegration")
	public void SFDC_TC01(String que, String detail) throws InterruptedException {

		// Type Content on the Search box
		rewd.findElement(By.xpath("//input[@part='input']")).sendKeys("Content");
		Thread.sleep(3000);
		// Click Content
		rewd.findElement(By.xpath("//mark[text()='Content']")).click();
		Thread.sleep(3000);
		// Click on Chatter Tab
		WebElement chatter = rewd.findElement(By.xpath("//span[text()='Chatter']"));
		rewd.executeScript("arguments[0].click();", chatter);
		// Verify the Chatter title on the page
		String title = rewd.getTitle();
		System.out.println("Title of the Page is:" + title);
		// Click the Question tab
		rewd.findElement(By.xpath("(//span[@class='title'])[3]")).click();		
		
		// Questions
		rewd.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys(que);
		// Detail
		rewd.findElement(By.xpath("//div[@contenteditable='true']//p[1]")).sendKeys(detail);

		// Click Ask
		rewd.findElement(By.xpath("//button[@title='Click, or press Ctrl+Enter']")).click();
		
		//Confirm the question appears
		WebElement question = rewd.findElement(By.xpath("(//span[@class='uiOutputText'])[3]"));
		question.getText();

	}
}
