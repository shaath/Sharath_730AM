package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowHandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		String wId=driver.getWindowHandle();
//		System.out.println(wId);
		
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();

		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String wId=it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			String acttitle=driver.getTitle();
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
			try 
			{
				if (acttitle.contains("Privacy")) 
				{
					driver.findElement(By.linkText("Terms of Service")).click();
					Sleeper.sleepTightInSeconds(3);
					System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
					break;
				}
				
			}
			catch (Exception e) 
			{
				System.out.println("The expected link not available in this page");
			}
		}
//		driver.findElement(By.linkText("Terms of Service")).click();
		driver.quit();

	}

}
