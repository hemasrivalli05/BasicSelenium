package com.learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetTagname_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		 WebElement registerLink = driver.findElement(By.linkText("Register"));
		 System.out.println(registerLink.getTagName());
		 
		 Thread.sleep(2000);
		 driver.quit();
	}

}
