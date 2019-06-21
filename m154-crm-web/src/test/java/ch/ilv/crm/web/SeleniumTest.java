package ch.ilv.crm.web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.TestCase;

public class SeleniumTest extends TestCase {

	@Test
	public void testCreateUser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/dev/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\dev\\Google\\Chrome\\Application\\chrome.exe");
		
        WebDriver driver=new ChromeDriver(options);
        
		driver.get("http://localhost:7070/");
		String title = driver.getTitle();
		assertTrue(title.contains("CRM App"));

		WebElement productLink = driver.findElement(By.xpath("/html/body/a[2]"));
		productLink.click();
		
		WebElement description = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		description.sendKeys("Apfel");

		WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
		
		Thread.sleep(5000);
		
		button.click();

		WebElement ID = driver.findElement(By.xpath("/html/body/span"));
		String IDAusgabe = ID.getText();
		
		WebElement eingabeID = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
		eingabeID.sendKeys(IDAusgabe);
		
		WebElement button2 = driver.findElement(By.xpath("/html/body/form[2]/p/input"));
		button2.click();
		
		
		
		
	}
		
}
