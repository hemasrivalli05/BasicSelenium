package com.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Navigate_Validate {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		
		//fetch the title 
		String title = driver.getTitle();
		System.out.println(title);
		
			// validation 
			if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
				System.out.println("welcome");
			}else {
				System.out.println("invalid");
			}
			
		Navigation cart = driver.navigate();
		cart.to("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		
		//fetch the title 
		String carttitle = driver.getTitle();
		System.out.println(carttitle);
		
			// validation 
			if(carttitle.equals("Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com")) {
				System.out.println("welcome cart page");
			}else {
				System.out.println("invalid cart ");
			}	
			Thread.sleep(3000);

		//click on login button
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/button")).click();
		Thread.sleep(3000);
		//GET CURRENT URL	
				String currenturl = driver.getCurrentUrl();
				System.out.println(currenturl);
				//validate
				if (currenturl.equals("https://www.flipkart.com/account/login?ret=/viewcart")) {
					System.out.println("valid url");
				}else 
						System.out.println("invlid url");
	}

}
