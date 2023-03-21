package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.xpath("//h1[contains(text(),'Better Tomorrow')]"));
		String text = txt.getText();
		System.out.println("Text is="+text);
	}

}
