package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement multipledropdown = driver.findElement(By.name("country"));
		Select sel = new Select(multipledropdown);
		
		multipledropdown.click();

		Thread.sleep(2000);
		List<WebElement> alloptions = sel.getOptions();
		
		for(int i=0; i< alloptions.size(); i++) {
			WebElement element = alloptions.get(i);
			System.out.println(element.getText());
			element.click();
			
		}
		Thread.sleep(2000);
		sel.deselectAll();
			
	}

}
