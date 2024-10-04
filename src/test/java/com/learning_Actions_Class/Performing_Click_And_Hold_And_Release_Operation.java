package com.learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Performing_Click_And_Hold_And_Release_Operation {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.id("box106"));
		WebElement capitals = driver.findElement(By.id("capitals"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(source).release(target).perform();
		Thread.sleep(2000);
		action.clickAndHold(source).release(capitals).perform();
		
	}

}
