package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ch2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.id("identifierId"));
		mail.sendKeys("vkavinkumar2k@gmail.com");
		WebElement next = driver.findElement(By.className("VfPpkd-vQzf8d"));
		next.click();
	}

}
