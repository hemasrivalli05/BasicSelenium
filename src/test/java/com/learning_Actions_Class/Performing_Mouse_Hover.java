package com.learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performing_Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));
		action.moveToElement(element).build().perform();
		
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Furniture']"))).perform();

	}

}
