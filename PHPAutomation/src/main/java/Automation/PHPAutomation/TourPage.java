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

public class TourPage extends Base
{
	Properties pro=new Properties();
	@Test
	public  void testcase4() throws InterruptedException, IOException {
		//launchbrowser();
		 FileInputStream f=new FileInputStream("C:\\Users\\Online Test\\git\\PHPTravels\\PHPAutomation\\Base.properties");
		pro.load(f);
		
		driver.get(pro.getProperty("URL"));
		
		driver.findElement(Toures).click();
		driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		driver.findElement(loca).click();
		driver.findElement(entertour).click();
		driver.findElement(tourchecin).click();
		while(true)
		{
	String str=driver.findElement(checkinmon).getText();
	 if(str.equals(pro.getProperty("monthopp"))) {
		 break;
	 }
	 else {
		 driver.findElement(movenx).click();
	 }
		}
	driver.findElement(checkintour).click();

		
		driver.findElement(guest).click();
		driver.findElement(guestno).click();
		driver.findElement(toursel).click();
		driver.findElement(types).click();
		driver.findElement(toursearch).click();
		
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\New folder\\pic\\Screenshot5.png"));
		
		
	}
		
	}

