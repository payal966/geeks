package GeeksAndGeeks.Credentials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Secondcredentials {
	
	
	
	 public WebDriver driver;
		
		@Test
		 public void Second_User_validpassword() {
			 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://practice.geeksforgeeks.org/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
			 driver.manage().deleteAllCookies();
			 driver.findElement(By.xpath("//a[contains(text(),\"Sign In\")]/preceding::ul[2]")).click();
			 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("https://auth.geeksforgeeks.org/user/demo_2");
		     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("aeIOu1234");
		     driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		       String actual1 = driver.findElement(By.xpath("//input[@id='password']")).getText();
			    String Expected1 ="aeIOu1234";
			    Assert.assertEquals(actual1, Expected1);
			 
		 }
		
		@Test
		public void Second_invalidpassword() {
			driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("https://auth.geeksforgeeks.org/user/demo_2");;
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("aeio1234");
			driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
			 String actual11 = driver.findElement(By.xpath("//input[@id=\"password\"]")).getText();
			    String Expected11 ="Incorrect login credentials";
			    Assert.assertEquals(actual11, Expected11);
			 
		 

	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
