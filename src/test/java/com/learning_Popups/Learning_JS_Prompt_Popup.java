package com.learning_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_JS_Prompt_Popup {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText(); // to fetch text
		System.out.println(text);
		driver.switchTo().alert().sendKeys("hello prompt popup");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
