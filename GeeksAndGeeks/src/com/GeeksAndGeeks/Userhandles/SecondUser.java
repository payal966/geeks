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

public class SecondUser {
	 public WebDriver driver;
	 public static Properties prop;
	 public FileInputStream fis=null;
	 
	 
	 
	 public SecondUser() {

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
	 public void Second_User_validUrl() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(prop.getProperty("user2 URL"));
		 driver.get(prop.getProperty("user2 pwd"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 String actual2 = driver.getCurrentUrl();
		    String Expected2 ="https://auth.geeksforgeeks.org/user/demo_2";
		    Assert.assertEquals(actual2, Expected2);
		 
		 
		 
		 
		 
	 }
	
	@Test
	public void Second_invalidUrL() {
		driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("https://auth.geeksforgeeks.org/user/deo_user_2");;
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("aeIOu1234");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		 String actual22 = driver.getCurrentUrl();
		    String Expected22 ="https://auth.geeksforgeeks.org/user/demo_2";
		    Assert.assertEquals(actual22, Expected22);
		 
	 

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
