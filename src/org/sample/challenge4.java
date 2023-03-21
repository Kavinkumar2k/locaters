package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("page tittle is = " + driver.getTitle());
		WebElement email = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		email.sendKeys("123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("123456789");
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
	}

}
