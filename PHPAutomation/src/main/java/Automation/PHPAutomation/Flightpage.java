package Automation.PHPAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Flightpage extends Base
{
	Properties pro=new Properties();
	@Test
	public  void testcase3() throws InterruptedException, IOException {
		launchbrowser();
		 FileInputStream f=new FileInputStream("C:\\New folder\\PHPAutomation\\Base.properties");
		pro.load(f);
		
		driver.get(pro.getProperty("URL"));
		
		driver.findElement(Flightss).click();
		driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		//fromloc
		driver.findElement(enterloc).click();
		
		driver.findElement(enterloc).sendKeys(pro.getProperty("fromloc"));
		
		Thread.sleep(1000);
	
		driver.findElement(entloc).click();
		//to loc
		
	
		driver.findElement(sendto).click();
		driver.findElement(sendto).sendKeys(pro.getProperty("toloca"));
		
	}
}
