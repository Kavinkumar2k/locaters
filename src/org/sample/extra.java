package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extra {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}

}
