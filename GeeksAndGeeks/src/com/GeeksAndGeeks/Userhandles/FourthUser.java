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

public class FourthUser {
	
	 public WebDriver driver;
	 public static Properties prop;
	 public FileInputStream fis=null;
	 
	 
	 
	 public FourthUser() {

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
	 public void Fourth_User_validUrl() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(prop.getProperty("user2 URL"));
		 driver.get(prop.getProperty("user2 pwd"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(42, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 String actual4 = driver.getCurrentUrl();
		    String Expected4 ="https://auth.geeksforgeeks.org/user/demo_4";
		    Assert.assertEquals(actual4, Expected4);
		 
		 
	 }
	
	@Test
	public void Fourth_invalidUrL() {
		driver.findElement(By.xpath("//input[@id=\"luser\"]")).sendKeys("https://auth.geeksforgeeks.org/user/deo_user_4");;
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abCDefg");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	    String actual44 = driver.getCurrentUrl();
	    String Expected44 ="https://auth.geeksforgeeks.org/user/demo_4";
	    Assert.assertEquals(actual44, Expected44);
	 

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
