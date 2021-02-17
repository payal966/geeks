package Testcasesuserhandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class user1 {
	 public WebDriver driver;
	 
	 
	@Test 
 public void TC_01_US1() {
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://practice.geeksforgeeks.org/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("fimat2");
	 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abCD1234");
	 driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	String actualUs1 = driver.findElement(By.xpath("//input[@id=\"luser\"]")).getText();
	 String expectedUs1 = "fimat2" ;                         //for valid range userhandle
	 Assert.assertEquals(actualUs1, expectedUs1);  
 }
 
 
 @Test
 public void TC_O1_Us1() {
	 driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("fimat289");
	 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abCD1234");
	 driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	String actualUs11 = driver.findElement(By.xpath("//input[@id=\"luser\"]")).getText();
	 String expectedUs11 = "fimat2" ;                    // for invalid  range userhandle      
	 Assert.assertEquals(actualUs11, expectedUs11);   
 }
 
 
 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

