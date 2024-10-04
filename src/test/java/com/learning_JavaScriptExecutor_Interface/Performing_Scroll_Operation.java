package com.learning_JavaScriptExecutor_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performing_Scroll_Operation {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver(); //Upcasting
		driver.manage().window().maximize(); 
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", element); //element top shows which means scroll down 
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", element); //element bottom shows which means scroll up
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", element);



	}

}
