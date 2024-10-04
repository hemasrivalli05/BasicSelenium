package com.autoSuggestion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosuggestions_FindElements_Method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile");
		Thread.sleep(1000); 
		 List <WebElement> suggestions = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));

		for (WebElement suggestion: suggestions) {
			System.out.println(suggestion.getText()); 
		if (suggestion.getText().equals("mobile")) { 
			suggestion.click();
			break;
			}
		}
		
		System.out.println("=========fetch all products========");
		 List <WebElement> products = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		 
		 for (WebElement product: products) {
				System.out.println(product.getText()); 

			}

	}

}
