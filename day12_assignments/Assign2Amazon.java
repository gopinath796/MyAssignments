package day12_assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign2Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Load the URL Amazon
		driver.get("https://www.amazon.in/");
		//search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		// Click Search
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Get the price of the first product
		String price = driver.findElement(By.xpath("(//img[@class='s-image'])[2]")).getText();
		Thread.sleep(3000);
		
		Actions ggg=new Actions(driver);
		WebElement mclick = driver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-small')]"));
		ggg.moveToElement(mclick).perform();
		Thread.sleep(3000);
		
		String rating = driver.findElement(By.xpath("(//span[text()='3.0 out of 5 stars'])[1]")).getText();
		System.out.println("Customer Ratings: "+rating);
		Thread.sleep(3000);
		
		//Click the first text link of the first image
		//driver.findElement(By.xpath("//span[text()='(Renewed) OnePlus 9 Pro 5G Pine Green, 12GB RAM, 256GB Storage']")).click();
		
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Set<String> windowHandles = driver.getWindowHandles();		
		List<String> allList=new ArrayList<String>(windowHandles);
		driver.switchTo().window(allList.get(1));
		File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snapshot/oneplus.png");
		FileUtils.copyFile(source, dest);

	}

}
