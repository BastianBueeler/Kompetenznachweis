//package ch.ilv.crm.web;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import junit.framework.TestCase;
//
//public class SeleniumTest extends TestCase {
//
//	@Test
//	public void testCreateUser() throws Exception {
//		
//		System.setProperty("webdriver.chrome.driver", "C:/dev/chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//        options.setBinary("C:\\dev\\Google\\Chrome\\Application\\chrome.exe");
//		
//        WebDriver driver=new ChromeDriver(options);
//        
//		driver.get("http://localhost:7070/");
//		String title = driver.getTitle();
//		assertTrue(title.contains("CRM App"));
//
//		WebElement forename = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
//		forename.sendKeys("Bastian");
//
//		WebElement name = driver.findElement(By.xpath("/html/body/form[1]/input[2]"));
//		name.sendKeys("Bueeler");
//
//		WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
//		
//		Thread.sleep(5000);
//		
//		button.click();
//
//		WebElement username = driver.findElement(By.xpath("/html/body/span"));
//
//		assertTrue(username.getText().trim().contains("Bastian Bueeler"));
//		
//		
//		//SEARCH//
//		
//		driver.get("http://localhost:7070/");
//		
//		WebElement customerId = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
//		customerId.sendKeys("1");
//		
//		WebElement button2 = driver.findElement(By.xpath("/html/body/form[2]/p/input"));
//		Thread.sleep(5000);
//		
//		button2.click();
//		
//		
//		WebElement forename2 = driver.findElement(By.id("forename2"));
//		WebElement name2 = driver.findElement(By.id("name2"));
//		
//		assertTrue(forename2.getText().trim().contains("Bastian"));
//		assertTrue(name2.getText().trim().contains("Bueeler"));
//	}
//		
//}
