package com.learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performing_Right_Click_Action {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(element).perform();
		Thread.sleep(2000);
		action.click(driver.findElement(By.xpath("//span[text()='Copy']"))).perform();

	}

}
