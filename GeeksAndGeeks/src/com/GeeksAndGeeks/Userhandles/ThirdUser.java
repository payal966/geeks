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

public class ThirdUser {
	
	 public WebDriver driver;
	 public static Properties prop;
	 public FileInputStream fis=null;
	 
	 
	 
	 public ThirdUser() {

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
	 public void Third_User_validUrl() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(prop.getProperty("user1 URL"));
		 driver.get(prop.getProperty("user1 pwd"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 String actual3 = driver.getCurrentUrl();
		    String Expected3 ="https://auth.geeksforgeeks.org/user/demo_3";
		    Assert.assertEquals(actual3, Expected3);
		 
	 }
	
	@Test
	public void Third_invalidUrL() {
		driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("https://auth.geeksforgeeks.org/user/dmo_user_3");;
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("usER3pssw");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		 String actual33 = driver.getCurrentUrl();
		    String Expected33 ="https://auth.geeksforgeeks.org/user/demo_3";
		    Assert.assertEquals(actual33, Expected33);
		 
	 

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
