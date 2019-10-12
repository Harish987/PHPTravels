package Automation.PHPAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Hotelpage extends Base
{
	Properties pro=new Properties();
	@Test
	public  void testcase2() throws InterruptedException, IOException {
		//launchbrowser();
		 FileInputStream f=new FileInputStream("C:\\Users\\Online Test\\git\\PHPTravels\\PHPAutomation\\Base.properties");
		pro.load(f);
		
		driver.get(pro.getProperty("URL"));
		driver.findElement(Hotel).click();
		driver.findElement(searchcity).click();

		driver.findElement(entervalue).sendKeys(pro.getProperty("cityName"));
		
		driver.findElement(entervalue).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(select).click();
		driver.findElement(checkin).click();
		
		while(true)
			{
		String str=driver.findElement(moun).getText();
		 if(str.equals(pro.getProperty("month"))) {
			 break;
		 }
		 else {
			 driver.findElement(move).click();
		 }
			}
		driver.findElement(checkindate).click();
		
		
		
		
		 while(true) {
			 String str1=driver.findElement(chemoun).getText();
			 if(str1.equals(pro.getProperty("month1"))) {
				 break;
			 }
			 else {
				 driver.findElement(move1).click();
			 }
		 }
	
		 driver.findElement(checkoutdate1).click();
		 
		 driver.findElement(adulchild).click();
		 driver.findElement(adult).sendKeys(Keys.BACK_SPACE);
		 driver.findElement(adult).sendKeys(pro.getProperty("adul"));
		 driver.findElement(child).sendKeys(Keys.BACK_SPACE);
		 driver.findElement(child).sendKeys(pro.getProperty("childs"));
		 driver.findElement(searchclick1).click();
		 
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\New folder\\pic\\Screenshot3.png"));
	
	}
	}

