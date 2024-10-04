package com.learning_JavaScriptExecutor_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Hidden_WebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver(); //Upcasting
		driver.manage().window().maximize(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("hide-textbox")).click();//will get ElementNotInteracatableExcepetion because hidden
		WebElement element = driver.findElement(By.id("displayed-text"));
		
		//typecast driver into javascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//call the method
		js.executeScript("arguments[0].value='aman'", element);

	}

}
