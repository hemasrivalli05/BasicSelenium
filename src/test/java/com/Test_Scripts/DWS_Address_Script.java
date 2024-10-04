package com.Test_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWS_Address_Script {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();	
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/input[1]")).sendKeys("h13@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[3]/input[1]")).sendKeys("!h12pswd");
		WebElement button = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));		
		button.click();			
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("(//input[@value='Add new'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='Address_FirstName']")).sendKeys("Sri");
		driver.findElement(By.xpath("//input[@id='Address_LastName']")).sendKeys("valli");
		driver.findElement(By.xpath("//input[@id='Address_Email']")).sendKeys("h13@gmail.com");
		driver.findElement(By.xpath("//input[@id='Address_Company']")).sendKeys("qs");
		
		WebElement dropdown = driver.findElement(By.name("Address.CountryId"));
		Select sel = new Select(dropdown);
		
		List<WebElement> options = sel.getOptions();//how many webelements - 5 , 5 we are the 
		
		for(int i=0; i< options.size(); i++) {
			WebElement element = options.get(i);
//			System.out.println(element.getText());		
			 if(element.getText().equals("India")) {
	                sel.selectByVisibleText("India");
	                break;
			 }
		}
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Address_City']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//input[@id='Address_Address1']")).sendKeys("Janakpuri");
		driver.findElement(By.xpath("//input[@id='Address_Address2']")).sendKeys("district center");
		driver.findElement(By.xpath("//input[@id='Address_ZipPostalCode']")).sendKeys("110058");
		driver.findElement(By.xpath("//input[@id='Address_PhoneNumber']")).sendKeys("1234564879");
//		fax number optional so skipped
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.quit();
	}

}
