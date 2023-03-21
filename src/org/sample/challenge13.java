package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://inmakesedu.com");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'2')]"));
		String text2 = text.getText();
		System.out.println("Text = "+text2);
	}

}
