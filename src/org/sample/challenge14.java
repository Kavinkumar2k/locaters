package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		search.sendKeys("Inmakes learning hub");
		WebElement searchicon = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		searchicon.click();
		WebElement link = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		link.click();
	}

}
