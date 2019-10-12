package Automation.PHPAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Loginpage extends Base
{
	Properties pro=new Properties();
	@Test
	public  void testcase1() throws Exception {
		launchbrowser();
		 FileInputStream f=new FileInputStream("C:\\Users\\Online Test\\git\\PHPTravels\\PHPAutomation\\Base.properties");
		pro.load(f);

		driver.get(pro.getProperty("URL"));

		driver.findElement(Myaccount).click();

		driver.findElement(login).click();		
		
		driver.findElement(Emailid).sendKeys(pro.getProperty("Emailid"));
		driver.findElement(pwd).sendKeys(pro.getProperty("password"));
		driver.findElement(logbt).click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\New folder\\pic\\Screenshot2.png"));
		
		driver.quit();
		
		
		
	}
}


