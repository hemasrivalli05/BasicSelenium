package com.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seaechproduct_and_fetch_title {
	
	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://www.flipkart.com/"); 
		driver.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER); 
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();

		//This is used to fetch parent windowID 
		String parentWindowID = driver.getWindowHandle(); 
		System.out.println(parentWindowID); 
		//This is used to fetch all windowIDs 
		Set<String> allWindowID= driver.getWindowHandles(); 
		System.out.println(allWindowID); 
		//This is used to remove parent windowID from allWindowIDs 
		allWindowID.remove(parentWindowID);

		for (String windowID: allWindowID) { 
			//This is used to switch to the childWindow 
			driver.switchTo().window(windowID); 
			System.out.println(driver.getTitle()); 
			String text = driver.findElement(By.xpath("//span[@class='VU-ZEz']")).getText(); 
			System.out.println(text);

		}
		
		
		
		
//		WebDriver driver = new ChromeDriver();
////		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.myntra.com/");
//		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirt");
//		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
//		driver.findElement(By.xpath("(//li[@class='product-base'])[1]")).click();
//		
//		
//		//this is used to fetch parent windowID
//		String parentWindowID = driver.getWindowHandle();
//		System.out.println(parentWindowID);
//		//this is used to fetch all windowIDs
//		Set<String> allWindowID = driver.getWindowHandles();
//		System.out.println(allWindowID);
//		//this is used to remove parent windowID from all windowIDs
//		allWindowID.remove(parentWindowID);
//		
//		for(String windowID : allWindowID) {
//			//this is used to switch to the chilWindow
//			driver.switchTo().window(windowID);
//			System.out.println(driver.getTitle());
//			WebElement text = driver.findElement(By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[2]"));
//			System.out.println(text);
//			driver.close();
//		}
		
		
//		driver.findElement(By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[2]")).click();
//		
//		//this is used to fetch parent windowID
//		String parentWindowID = driver.getWindowHandle();
//		System.out.println(parentWindowID);
//		//this is used to fetch all windowIDs
//		Set<String> allWindowID = driver.getWindowHandles();
//		System.out.println(allWindowID);
//		//this is used to remove parent windowID from all windowIDs
//		allWindowID.remove(parentWindowID);
//		
//		for(String windowID : allWindowID) {
//			//this is used to switch to the chilWindow
//			driver.switchTo().window(windowID);
//			System.out.println(driver.getTitle());
//			String text = driver.findElement(By.xpath("//h1[contains(@class,'6EBuvT')]")).getText();
//			System.out.println(text);
//			driver.close();
//		}
//	 //this line will switch back the control to parent window
//		driver.switchTo().window(parentWindowID);
//		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}
