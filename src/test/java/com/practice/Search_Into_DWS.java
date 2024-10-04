package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Into_DWS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//3.className locator
//		driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("shop");
//		driver.findElement(By.className("button-1 search-box-button")).click();//this not working need to know y

//		Exception in thread "main" org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
//		For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#invalid-selector-exception
//		Build info: version: '4.19.1', revision: 'abe0ee07dc'
//		System info: os.name: 'Windows 11', os.arch: 'amd64', os.version: '10.0', java.version: '17.0.6'
//		Driver info: driver.version: unknown
//			at org.openqa.selenium.By$ByClassName.<init>(By.java:309)
//			at org.openqa.selenium.By.className(By.java:100)
//			at com.practice.Search_Into_DWS.main(Search_Into_DWS.java:17)
		
		driver.findElement(By.className("search-box-text")).sendKeys("shop");
		driver.findElement(By.className("button-1")).click();
//always pass first class name 

	}

}
