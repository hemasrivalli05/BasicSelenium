package com.learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetCssValue_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		System.out.println(button.getCssValue("font"));
		System.out.println(button.getCssValue("color"));
		System.out.println(button.getCssValue("height"));
		System.out.println(button.getCssValue("width"));

		
		Thread.sleep(2000);
		driver.quit();

	}

}
