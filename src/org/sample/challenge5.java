package org.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class challenge5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\locater\\drivers\\chromedriver.exe");
		WebDriver l = new ChromeDriver();
		l.get(" http://demo.automationtesting.in/Register.html");
		System.out.println("pagetittle is = "+ l.getTitle());
		l.manage().window().maximize();
		WebElement firstname = l.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("kavinkumar");
		WebElement lastname = l.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("velusamy");
		WebElement address = l.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("muthur, tiruppur dt, tamilnadu.");
		WebElement email = l.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("kavin@gmail.com");
		WebElement phone = l.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9876543120");
		WebElement radio = l.findElement(By.xpath("//input[@value='Male']"));
		radio.click();
		WebElement hobbie = l.findElement(By.xpath("//input[@value='Movies']"));
		hobbie.click();
		WebElement lan = l.findElement(By.id("msdd"));
		lan.click();
		WebElement langauge = l.findElement(By.xpath("(//a[@style='text-decoration:none'])[8]"));
		langauge.click();
		WebElement langauge1 = l.findElement(By.xpath("(//a[@style='text-decoration:none'])[5]"));
		langauge1.click();
		phone.click();
		WebElement skill = l.findElement(By.xpath("//select[@ng-model='Skill']"));
		skill.click();
		WebElement skill1 = l.findElement(By.xpath("//option[@value='Software']"));
		skill1.click();
		WebElement country = l.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		WebElement country1 = l.findElement(By.xpath("//input[@class='select2-search__field']"));
		country1.sendKeys("in");
		WebElement country2 = l.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']"));
		country2.click();
		WebElement year = l.findElement(By.xpath("(//select[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[2]"));
		year.click();
		WebElement year1 = l.findElement(By.xpath("//option[@value='2000']"));
		year1.click();
		WebElement month = l.findElement(By.xpath("(//select[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[2]"));
		month.click();
		WebElement month1 = l.findElement(By.xpath("//option[@value='January']"));
		month1.click();
		WebElement day = l.findElement(By.xpath("//select[@placeholder='Day']"));
		day.click();
		WebElement day1 = l.findElement(By.xpath("//option[@value='10']"));
		day1.click();
		WebElement password = l.findElement(By.id("firstpassword"));
		password.sendKeys("1234567890");
		WebElement confirmpassword = l.findElement(By.id("secondpassword"));
		confirmpassword.sendKeys("1234567890");
//		WebElement button = l.findElement(By.xpath("//button[@id='submitbtn']"));
//		button.click();
//		
		
		
		
		
	}

}
