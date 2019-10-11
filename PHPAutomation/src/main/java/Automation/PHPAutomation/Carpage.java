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

public class Carpage extends Base
{
	Properties pro=new Properties();
	@Test
	public  void testcase4() throws InterruptedException, IOException {
		//launchbrowser();
		 FileInputStream f=new FileInputStream("C:\\New folder\\PHPAutomation\\Base.properties");
		pro.load(f);
		
		driver.get(pro.getProperty("URL"));
		
		driver.findElement(carssss).click();
		driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		driver.findElement(carpicup).click();
		driver.findElement(picupcity).click();
        driver.findElement(cardate).click();
        //fromedate
        while(true) {
        String str=driver.findElement(carmonth).getText();
   	 if(str.equals(pro.getProperty("monthcar"))) {
   		 break;
   	 }
   	 else {
   		 driver.findElement(movenxt).click();
   	 }
   		}
   	driver.findElement(carindate).click();
   	
   	//returandate
   	
    while(true) {
        String str=driver.findElement(carmonthre).getText();
   	 if(str.equals(pro.getProperty("monthcarre"))) {
   		 break;
   	 }
   	 else {
   		 driver.findElement(movenext).click();
   	 }
   		}
    driver.findElement(carredate).click();
	driver.findElement(picuptime).click();
   	
  
   	driver.findElement(picuptimesele).click();
   	driver.findElement(droptime).click();
   	driver.findElement(dropretime).click();
   	driver.findElement(searchcar).click();
   	Thread.sleep(3000);
   	
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:\\New folder\\pic\\Screenshot6.png"));
   	 driver.quit();
   	
   	
   	
   	
   	
   
		
}
}