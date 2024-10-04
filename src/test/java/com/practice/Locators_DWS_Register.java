package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_DWS_Register {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Hema");
		driver.findElement(By.id("LastName")).sendKeys("Srivalli");
		driver.findElement(By.name("Email")).sendKeys("Sri@1gmail.com");
		driver.findElement(By.id("Password")).sendKeys("@hs123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("@hs123");
		driver.findElement(By.className("register-next-step-button")).click();
	}

}
