package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ach1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html ");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement place = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(source, place).perform();
		
//		WebElement amountsrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//		WebElement amountplace = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//		a.dragAndDrop(amountsrc, amountplace).perform();
		
		WebElement creditsrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement creditplace = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(creditsrc, creditplace).perform();
		
		WebElement amtsrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement amtplace = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		a.dragAndDrop(amtsrc, amtplace).perform();
		
	}

}
