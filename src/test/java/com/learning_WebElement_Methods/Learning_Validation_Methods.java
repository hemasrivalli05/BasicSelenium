package com.learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Validation_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement checkbox =driver.findElement(By.id("RememberMe"));
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		checkbox.click();
		Thread.sleep(2000);
		checkbox.click();
		System.out.println(checkbox.isSelected());
		System.out.println("=========validation==========");
		
		if(checkbox.isDisplayed()) {
			System.out.println(checkbox.isDisplayed());
			if(checkbox.isEnabled()) {
				System.out.println(checkbox.isEnabled());
				System.out.println(checkbox.isSelected());
	
			}
		}
	
	}

}
