package com.learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Learning_Single_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);

		WebElement dropdown = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
		Select sel = new Select(dropdown);

		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("10000");
		Thread.sleep(2000);
		sel.selectByVisibleText("₹30000");
		Thread.sleep(2000);
//		sel.deselectByIndex(4);
		
		List<WebElement> options = sel.getOptions();//how many webelements - 5 , 5 we are the 
		
		for(int i=0; i< options.size(); i++) {
			WebElement element = options.get(i);
			System.out.println(element.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
