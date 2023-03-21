package org.ch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("email"));
		search.sendKeys("kavinkumar");
		WebElement search1 = driver.findElement(By.name("pass"));
		search1.sendKeys("1234567890");
		WebElement search3 = driver.findElement(By.name("login"));
		search3.click();
		
	}
	

}
