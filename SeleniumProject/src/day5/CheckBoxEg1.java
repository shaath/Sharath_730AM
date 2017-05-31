package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CheckBoxEg1 {

	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("seleniumtrainer449");
		driver.findElement(By.id("next")).click();
		Sleeper.sleepTightInSeconds(3);
		
		WebElement check=driver.findElement(By.id("PersistentCookie"));
		if (check.isSelected()) 
		{
			check.click();
		}
		else
		{
			System.out.println("It is already in unselected position");
		}
		
		
	}

}
