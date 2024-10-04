package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_By_Text_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		String text = driver.findElement(By.xpath("//h1[contains(text(),'Digital')]")).getText();

		if (text.equals("Digital downloads")) {
			System.out.println("correct");
		}else {
			System.out.println("not correct");
		}
	}

}
