package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement img = driver.findElement(By.xpath("//img[@class='_deals-shoveler-v2_style_dealImagePrimavera__39h59']"));
		img.click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptops");
		WebElement icon = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
		icon.click();
	}

}
