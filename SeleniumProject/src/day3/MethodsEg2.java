package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		//Redirecting to facebook
		driver.navigate().to("http://facebook.com");
		Sleeper.sleepTightInSeconds(5);
		//Navigate back to google
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		//Navigate to facebook
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		//Refresh
		driver.navigate().refresh();
		

	}

}
