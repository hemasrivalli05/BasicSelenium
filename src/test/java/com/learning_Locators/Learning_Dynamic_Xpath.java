package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Dynamic_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'$25 Virtual Gift Card')]/../../..//input[@value='Add to cart']")).click();
		//we can write contains but have to write full part of text
		//without contains ->
		driver.findElement(By.xpath("//a[(text(),'$25 Virtual Gift Card')]/../../..//input[@value='Add to cart']")).click();
		

	}

}
