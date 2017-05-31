package methodsEg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuseEg {

	public static void main(String[] args)
	{
//		MethodsEg.function1();
//		int val1=40;
//		int val2=50;
		MethodsEg m=new MethodsEg();
//		int result=m.sum(val1, val2);
//		System.out.println(result);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		
		m.send_text(driver, "id", "txtUsername", "Admin");
		
	}

}
