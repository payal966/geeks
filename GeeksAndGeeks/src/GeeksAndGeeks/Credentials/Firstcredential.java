package GeeksAndGeeks.Credentials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Firstcredential {
	 public WebDriver driver;
	
	@Test
	 public void First_User_validpassword() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://practice.geeksforgeeks.org/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.findElement(By.xpath("//a[contains(text(),\"Sign In\")]/preceding::ul[2]")).click();
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("https://auth.geeksforgeeks.org/user/fimat2");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abCDd1234");
	     driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	       String actual1 = driver.findElement(By.xpath("//input[@id='password']")).getText();
		    String Expected1 ="abCD1234";
		    Assert.assertEquals(actual1, Expected1);
		 
	 }
	
	@Test
	public void First_invalidpassword() {
		driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("https://auth.geeksforgeeks.org/user/fimat2992");;
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abc1234");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		 String actual11 = driver.findElement(By.xpath("//input[@id=\"password\"]")).getText();
		    String Expected11 ="Incorrect login credentials";
		    Assert.assertEquals(actual11, Expected11);
		 
	 

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
