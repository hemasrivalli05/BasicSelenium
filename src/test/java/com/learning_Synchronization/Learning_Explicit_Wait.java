package com.learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //optional
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Shop"));
		
		//whether login link is clickable or not
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.name("Email")).sendKeys("Sri@1gmail.com");
		driver.findElement(By.id("Password")).sendKeys("@hs123");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Log in']")));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
