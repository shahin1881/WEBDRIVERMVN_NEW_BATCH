package com.test.Git_FB_Prj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	  public static  WebDriver driver;
	   
	   @BeforeTest
	   public void SetUp(){
		   System.setProperty("webdriver.chrome.driver", "D:\\EduSol\\Selenium Jar Files\\Selenium Webdrivers\\Chrome_Dwoaload\\chromedriver.exe");
		   driver=new ChromeDriver(); 
			
	   }
	   
	   @Test
	   public void doLogin(){
	   System.out.println("Executing Login Test"); 
	   driver.get("https://www.facebook.com/");
	   driver.getTitle();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(40L ,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("shahinsayyed66@gmail.com");
	   driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("shahin123");
	   driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
	   
	   }
	   
	    @AfterTest
	   public void closing()
	   {
	    	if(driver!=null)
		    driver.close();
	   }
}