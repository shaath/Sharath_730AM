package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		List<WebElement> radios=block.findElements(By.tagName("input"));
		
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String rtext=radios.get(i).getAttribute("value");
			System.out.println(rtext);
			
			
//			if (radios.get(i).isSelected())
//			{
//				System.out.println(rtext + " is in selected position");
//				break;
//			}
			
			if (rtext.equalsIgnoreCase("MultiCity"))
			{
				radios.get(i).click();
				break;
			}
		}
		
	}

}
