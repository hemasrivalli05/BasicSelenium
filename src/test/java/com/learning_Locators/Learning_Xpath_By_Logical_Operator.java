package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_By_Logical_Operator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@type='text' and @value='Search store']")).sendKeys("books");
		driver.findElement(By.name("q")).sendKeys("iphone 15");

		driver.findElement(By.xpath("//*[name()='svg' and @viewBox='0 0 24 24']")).click();
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Search' and @class='button-1 search-box-button']")).click();
	}

}
