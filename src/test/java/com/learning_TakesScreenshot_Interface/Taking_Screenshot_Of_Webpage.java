package com.learning_TakesScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_Screenshot_Of_Webpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //Upcasting
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//typecasting to takes screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		//we have taken the screenshot , but it is presents in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);//it is in RAM
		//we are creating the file in ROM/ main memory/ system memory
		File dest = new File("./screenshots/flipkartWelcomePage.png");
		//copy the screenshots from RAM to main Memory
		FileHandler.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
