package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Name_Locators {

	public static void main(String[] args) throws InterruptedException {
//		2. Name locator
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewsletterEmail")).sendKeys("abc2@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

}
