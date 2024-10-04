package com.learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_Multiple_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement multipledropdown = driver.findElement(By.name("Month"));
		Select sel = new Select(multipledropdown);

		sel.selectByIndex(3);
		sel.selectByValue("May");
		sel.selectByVisibleText("July");
		Thread.sleep(2000);
		sel.deselectByIndex(7);
		sel.deselectByValue("Ma");
		sel.deselectByVisibleText("May");
		
		Thread.sleep(2000);
		sel.selectByIndex(4);
		sel.selectByValue("June");
		sel.selectByVisibleText("August");
		
		List<WebElement> alloptions = sel.getAllSelectedOptions();
		
		for(int i=0; i< alloptions.size(); i++) {
			WebElement element = alloptions.get(i);
			System.out.println(element.getText());
		}
		Thread.sleep(2000);
		
		boolean muloptions = sel.isMultiple();
		System.out.println(muloptions);

		
//		driver.quit();

	}

}
