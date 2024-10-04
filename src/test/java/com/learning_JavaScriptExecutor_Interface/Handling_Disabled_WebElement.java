package com.learning_JavaScriptExecutor_Interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Disabled_WebElement {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver(); //Upcasting
		driver.manage().window().maximize(); 
		driver.get("https://demoapp.skillrary.com/ ");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));//will get ElementNotInteracatableExcepetion because hidden
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='hema'", element);

	}

}
