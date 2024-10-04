package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Dynamic_Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement name = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']"));
		System.out.println(name);
		WebElement price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../../..//div[contains(@class, 'DiR')]"));
		System.out.println(price.getText());

	}

}
