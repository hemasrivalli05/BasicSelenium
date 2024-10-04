package com.Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DWS_Register_Explicit {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Register"));
		
        WebElement genderFemale = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gender-female']")));
        genderFemale.click();

        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
        firstName.sendKeys("Srivalli");

        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("LastName")));
        lastName.sendKeys("RHS");

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Email']")));
        email.sendKeys("h13@gmail.com");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'text-box single-line password')])[1]")));
        password.sendKeys("!h12pswd");

        WebElement confirmPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'text-box single-line password')])[2]")));
        confirmPassword.sendKeys("!h12pswd");

        WebElement registerButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='register-button']")));
        registerButton.click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
