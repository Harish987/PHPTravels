package Automation.PHPAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class RegistrationpageTest  extends Base{
	
	
	Properties pro=new Properties();
	@Test
	public  void testcase() throws IOException, InterruptedException {
	//launchbrowser();
		 FileInputStream f=new FileInputStream("C:\\Users\\Online Test\\git\\PHPTravels\\PHPAutomation\\Base.properties");
		pro.load(f);
		
		driver.get(pro.getProperty("URL"));

		driver.findElement(Myaccount).click();

		driver.findElement(Signup).click();

		driver.findElement(Firstname).sendKeys(pro.getProperty("Firstname"));
		driver.findElement(Lastname).sendKeys(pro.getProperty("Lastname"));
		driver.findElement(Mobilenumber).sendKeys(pro.getProperty("Mobilenumber"));
	driver.findElement(Email).sendKeys(pro.getProperty("Emailid"));
	driver.findElement(Password).sendKeys(pro.getProperty("password"));
	driver.findElement(Confirm).sendKeys(pro.getProperty("confirmpassword"));
driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
	driver.findElement(Submit).click();
Thread.sleep(2000);
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\New folder\\pic\\Screenshot1.png"));
	
	//driver.quit();
	
	}
}
