package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginEg {
	
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("gande3@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("#loginbutton")).click();
	}

}
