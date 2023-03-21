package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge16 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		search.sendKeys("samsung mobile");
		WebElement button = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		button.click();
		WebElement mob = driver.findElement(By.xpath("//img[@data-img='https://cdn.shopclues.com/images1/thumbnails/116610/200/200/153167361-116610305-1663846315.jpg']"));
		mob.click();
	}

}
