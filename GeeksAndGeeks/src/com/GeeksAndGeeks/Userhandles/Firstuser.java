package com.GeeksAndGeeks.Userhandles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Firstuser {
	 public WebDriver driver;
	 public static Properties prop;
	 public FileInputStream fis=null;
	 
	 
	 
	 public Firstuser() {

			String propPath=System.getProperty("user.dir")+"\\src\\resource\\config.properties";
		
		          prop = new Properties();
			
	           try {
		

			         fis = new FileInputStream((propPath));

				          prop.load(fis);
				
	              

			
	                } catch (FileNotFoundException e) {

				
	                       e.printStackTrace();
			
	                  } 
	                        catch (IOException e) {
		
			
	                        e.printStackTrace();
			
	                         }
	 }
	 
	@Test
	 public void First_User_validUrl() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(prop.getProperty("user1 URL"));
		 driver.get(prop.getProperty("user1 pwd"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 String actual1 = driver.getCurrentUrl();
		    String Expected1 ="https://auth.geeksforgeeks.org/user/fimat2";
		    Assert.assertEquals(actual1, Expected1);
		 
	 }
	
	@Test
	public void First_invalidUrL() {
		driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("https://auth.geeksforgeeks.org/user/fimat29");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abCD1234");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		 String actual11 = driver.getCurrentUrl();
		    String Expected11 ="https://auth.geeksforgeeks.org/user/fimat2";
		    Assert.assertEquals(actual11, Expected11);
		 
	 

}
}

