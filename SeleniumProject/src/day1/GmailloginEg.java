package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailloginEg {

	public static void main(String[] args)
	{
		//Launching the firefox
		FirefoxDriver driver=new FirefoxDriver();
		//Launch Gmail App
		driver.get("http://gmail.com");
		//maximizing the window
		driver.manage().window().maximize();

		//Identifying the email textbox
		WebElement email=driver.findElement(By.id("identifierId"));
		
		//Enter email id into that textbox
		email.sendKeys("seleniumtrainer449");
		
		//Deleting the text in textbox
		email.clear();
	}

}
