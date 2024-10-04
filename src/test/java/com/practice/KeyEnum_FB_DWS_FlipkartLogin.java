package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEnum_FB_DWS_FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {

		//facebook login with finding one element only -( with dummy mail )
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dummy@gmail.com" ,Keys.TAB, "hema123", Keys.ENTER);
		driver.quit();

		//DWS register with finding one element only- not clicked on register
		ChromeDriver driverDWS = new ChromeDriver();
//		driver.manage().window().maximize();
		driverDWS.get("https://demowebshop.tricentis.com/register");
		
		WebElement register = driverDWS.findElement(By.xpath("//input[@id='gender-female']"));
		register.click();
		register.sendKeys(Keys.TAB , "srivalli" ,Keys.TAB , "RH" ,Keys.TAB , "Hsri24@.com" ,Keys.TAB ,"sri2024" ,Keys.TAB ,"sri24");
		//register.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driverDWS.quit();
		
		ChromeDriver driverf = new ChromeDriver();
//		driver.manage().window().maximize();
		driverf.get("https://www.flipkart.com/");
		
		WebElement search = driverf.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.sendKeys("oppo" , Keys.ENTER );
		Thread.sleep(2000);
		driverf.quit();
	}
}
