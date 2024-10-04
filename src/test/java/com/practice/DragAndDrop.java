package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		WebElement[] sources = {driver.findElement(By.id("box1")), driver.findElement(By.id("box2")), driver.findElement(By.id("box3")), driver.findElement(By.id("box4")), driver.findElement(By.id("box5")), driver.findElement(By.id("box6")), driver.findElement(By.id("box7"))};
		WebElement[] targets = {driver.findElement(By.id("box101")), driver.findElement(By.id("box102")), driver.findElement(By.id("box103")), driver.findElement(By.id("box104")), driver.findElement(By.id("box105")), driver.findElement(By.id("box106")), driver.findElement(By.id("box107"))};
		WebElement target = driver.findElement(By.id("capitals"));
		Actions actions = new Actions(driver);
		for (int i = 0; i < sources.length; i++) {
		    actions.dragAndDrop(sources[i], targets[i]).build().perform();
		}
		for (int i = 0; i < sources.length; i++) {
		    actions.dragAndDrop(sources[i], target).build().perform();
		}

	}

}
