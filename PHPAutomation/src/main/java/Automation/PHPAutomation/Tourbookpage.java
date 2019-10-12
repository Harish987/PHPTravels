package Automation.PHPAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tourbookpage extends Base
{
	@Test
	public void book() throws IOException, Exception {
		
		launchbrowser();
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
	
	
	driver.findElement(tourbook).click();
	driver.findElement(tourfirstname).sendKeys(pro.getProperty("Firstname"));
	driver.findElement(tourlastname).sendKeys(pro.getProperty("Lastname"));
	driver.findElement(touremail).sendKeys(pro.getProperty("Emailid"));
	driver.findElement(tourcon).sendKeys(pro.getProperty("Emailid"));
	driver.findElement(tourphone).sendKeys(pro.getProperty("Mobilenumber"));
	driver.findElement(touradd).sendKeys(pro.getProperty("Address"));
	driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
	driver.findElement(tourcoun).click();
	driver.findElement(tourci).click();
	
	
	
	
	}

}
