package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Login_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// //input[@class='oxd-input oxd-input--active' and @placeholder='Username']
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();//can call submit() instead of 
	
	}

}
