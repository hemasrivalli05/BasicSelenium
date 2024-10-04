package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_By_Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobile");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}

}
