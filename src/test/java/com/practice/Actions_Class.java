package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='Fashion']"));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Women Footwear']"))).perform();
		Thread.sleep(2000);
		action.click(driver.findElement(By.xpath("//a[text()='Women Wedges']"))).perform();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//h1"));
		System.out.println(text.getText());
		
	}

}
