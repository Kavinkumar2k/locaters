package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//input[@title='From station']"));
		from.sendKeys("kovai");
		WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
		to.sendKeys("kerala");
		WebElement button = driver.findElement(By.id("trainFormButton"));
		button.click();
		
	}

}
