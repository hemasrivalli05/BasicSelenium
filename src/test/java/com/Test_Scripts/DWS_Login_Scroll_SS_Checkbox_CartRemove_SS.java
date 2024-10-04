package com.Test_Scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DWS_Login_Scroll_SS_Checkbox_CartRemove_SS {

	public static void main(String[] args) throws InterruptedException, IOException {
			
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize(); 
				driver.get("https://demowebshop.tricentis.com");
				
				driver.findElement(By.linkText("Log in")).click();	
				driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/input[1]")).sendKeys("h13@gmail.com");
				driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[3]/input[1]")).sendKeys("!h12pswd");
				WebElement button = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));		
				button.click();
				
				WebElement element1 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[6]"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				Thread.sleep(2000);
				js.executeScript("arguments[0].scrollIntoView(true)", element1); 
				Thread.sleep(2000);
			
				Actions action = new Actions(driver);
				WebElement cartScroll = driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']"));
				action.scrollToElement(cartScroll).perform();
				Thread.sleep(3000);
				action.click(cartScroll).perform();
				Thread.sleep(2000);

				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File ss1 = new File("./screenshots/DWS-Scroll-product-cart Page.png");
				FileHandler.copy(src, ss1);
				Thread.sleep(2000);
//				if already product in cart then direct cart page 	
				driver.findElement(By.linkText("Shopping cart")).click();	
				driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
				driver.findElement(By.xpath("//input[@name='updatecart']")).click();
				Thread.sleep(2000);

				WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']"));
				JavascriptExecutor js1 = (JavascriptExecutor)driver;
				Thread.sleep(2000);
				js1.executeScript("arguments[0].scrollIntoView(true)", element); 
				Thread.sleep(2000);
				TakesScreenshot ts1 = (TakesScreenshot)driver;
				File src1 = ts1.getScreenshotAs(OutputType.FILE);
				File ss2 = new File("./screenshots/DWSHomePage ss.png");
				FileHandler.copy(src1, ss2);
				Thread.sleep(2000);
//				driver.quit();

			}
}


