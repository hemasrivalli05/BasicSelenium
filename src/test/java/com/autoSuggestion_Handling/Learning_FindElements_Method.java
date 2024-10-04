package com.autoSuggestion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_FindElements_Method {

	public static void main(String[] args) throws InterruptedException {
//		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(1000); 
		 List <WebElement> suggestions = driver.findElements(By.xpath("//div[@class='lnnVSe']"));

		for (WebElement suggestion: suggestions) {
			System.out.println(suggestion.getText()); 
		if (suggestion.getText().equals("selenium testing")) { 
			suggestion.click();
			break;
	}
}
		
}
}