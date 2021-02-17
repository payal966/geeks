package Testcasesuserpaswd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class User4 {

	 public WebDriver driver;
		
		
	 @Test
	 public void TC_O1_Us4_pwrd1() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://practice.geeksforgeeks.org/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("demo_user_4");
		 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abCDefg");
		 driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		String actualUs11p = driver.findElement(By.xpath("//input[@id=\"luser\"]")).getText();
		 String expectedUs11p = "abCDefg" ;                           //for valid range 
		 Assert.assertEquals(actualUs11p, expectedUs11p);   
	 }
	 
	 
	 
	 @Test
	 public void TC_O1_Us4_pswd() {
		 driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("demo_user_48999");
		 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abCDefg76");
		 driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		String actualUs11 = driver.findElement(By.xpath("//input[@id=\"luser\"]")).getText();
		 String expectedUs11 = "abCDefg" ;                          // for invalid range
		 Assert.assertEquals(actualUs11, expectedUs11);   
	 }
		 
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
