package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://inmakesedu.com/about_us");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Inmakes ')]"));
		String text2 = text.getText();
		System.out.println("text = "+text2);
		WebElement para = driver.findElement(By.xpath("(//p[contains(text(),'Inmakes ')])[1]"));
		String text3 = para.getText();
		System.out.println("text = "+text3);
		WebElement text4 = driver.findElement(By.xpath("//p[contains(text(),'In ')]"));
		String text5 = text4.getText();
		System.out.println("Text = "+text5);
	}

}
