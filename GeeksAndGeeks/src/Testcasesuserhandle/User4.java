package Testcasesuserhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class User4 {
 public WebDriver driver;
		

		@Test 
	 public void TC_03_US3() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://practice.geeksforgeeks.org/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("demo_4");
		 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abCDefg");
		 driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		String actualUs1 = driver.findElement(By.xpath("//input[@id=\"luser\"]")).getText();
		 String expectedUs1 ="demo_4";                         //for valid range userhandle
		 Assert.assertEquals(actualUs1, expectedUs1);  
	 }
	 
	 
	 @Test
	 public void TC_O3_Us3() {
		 driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("demo_4456");
		 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abCDefg");
		 driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		String actualUs11 = driver.findElement(By.xpath("//input[@id=\"luser\"]")).getText();
		 String expectedUs11 = "demo_4" ;                    // for invalid  range userhandle      
		 Assert.assertEquals(actualUs11, expectedUs11);   
	 }
	 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
