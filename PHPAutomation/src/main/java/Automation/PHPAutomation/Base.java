package Automation.PHPAutomation;



import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
public static	WebDriver driver;
Properties pro=new Properties();
	//Registration Page 
	By Myaccount =By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By Signup =By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
    By Firstname=By.xpath("//input[@placeholder='First Name']");
    By Lastname=By.xpath("//input[@placeholder='Last Name']");
    By Mobilenumber=By.xpath("//input[@placeholder='Mobile Number']");
    By Email=By.xpath("//input[@placeholder='Email']");
    By Password=By.xpath("//input[@placeholder='Password']");
    By Confirm=By.xpath("//input[@placeholder='Confirm Password']");
    By Submit=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
    
    
    
    //Login Page 
    By login=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
    By Emailid=By.xpath("//input[@placeholder='Email']");
	By pwd=By.xpath("//input[@placeholder='Password']");
	By logbt=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	
	
	
	//Hotel Page
	By Hotel=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	By searchcity=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	By entervalue=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	By select=By.xpath("//div[contains(text(),'inda, India')]");
	By checkin=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/form[1]/div[2]/div[1]/input[1]");
	By moun=By.xpath("//div[14]//div[1]//tr[1]//th[2]");
	By move=By.xpath("//div[14]//div[1]//tr[1]//th[3]");
	By checkindate=By.xpath("//div[14]//tr[3]//td[3][contains(text(),"+pro.getProperty("date")+")]");
	By checkout=By.xpath("//input[@placeholder='Check out']");
	By chemoun=By.xpath("//div[15]//div[1]//tr[1]//th[2]");
	By move1=By.xpath("//div[15]//div[1]//tr[1]//th[3]");
	By checkoutdate1=By.xpath("//div[15]//tr[4]//td[4][contains(text(),"+pro.getProperty("checkoutdate")+")]");
	By adulchild=By.xpath("//input[@id='htravellersInput']");
	By adult=By.xpath("//input[@id='hadultInput']");
	By child=By.xpath("//input[@id='hchildInput']");
	By searchclick1=By.xpath("//button[contains(@class,'btn btn-lg btn-block btn-primary pfb0 loader')]");
	
	//Flight
	By Flightss=By.xpath("//div[@id='body-section']//li[2]//a[1]");
	By enterloc=By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");
	By entloc=By.xpath("/html/body/div[20]/ul/li[1]/div");
	By toloc=By.xpath("//*[@id=\"select2-drop\"]/div/input");
	By sendto=By.xpath("//*[@id=\"s2id_destination\"]/a/span[1]");
	By enterto=By.xpath("//*[@id=\"s2id_destination\"]/a");
	
	
	//Tour Page
	By Toures=By.xpath("//div[@id='body-section']//li[3]//a[1]");
	By loca=By.xpath("//*[@id=\"s2id_autogen3\"]/a");
	By entertour=By.xpath("//div[contains(text(),'Day Visit of Petra from Oman')]");
	By tourchecin=By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	By checkinmon=By.xpath("/html/body/div[11]/div[1]/table/thead/tr[1]/th[2]");
	By movenx=By.xpath("//div[11]//div[1]//tr[1]//th[3]");
	By checkintour=By.xpath("//div[11]//tr[3]//td[5][contains(text(),"+pro.getProperty("checkin")+")]");
	By guest=By.xpath("//*[@id=\"adults\"]");
	By guestno=By.xpath("//*[@id=\"adults\"]/option[4]");
	By toursel=By.xpath("//select[@id='tourtype']");
	By types=By.xpath("//option[contains(text(),'Holidays')]");
	By toursearch=By.xpath("//*[@id=\"tours\"]/form/div[5]/button");
	
	
	//Car page
	By carssss=By.xpath("//a[@href='#cars']");
	By carpicup=By.xpath("//div[@id='s2id_carlocations']//a[contains(@class,'select2-choice')]");
	By picupcity=By.xpath("//div[contains(text(),'Malaysia')]");
	By droploc=By.xpath("//div[@id='select2-drop']//input[contains(@class,'select2-input')]");
	By cardate=By.xpath("//input[@id='departcar']");
	By  carmonth=By.xpath("/html/body/div[12]/div[1]/table/thead/tr[1]/th[2]");
	By movenxt=By.xpath("//div[12]//div[1]//tr[1]//th[3]");
	By carindate=By.xpath("//div[12]//tr[5]//td[4][contains(text(),"+pro.getProperty("checkincardate")+")]");
	By picuptime=By.xpath("//select[contains(@name,'pickupTime')]");
	By carmonthre=By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[2]");
	By movenext=By.xpath("//div[13]//div[1]//tr[1]//th[3]");
	By carredate=By.xpath("//div[13]//tr[4]//td[5][contains(text(),"+pro.getProperty("redate")+")]");
	By picuptimesele=By.xpath("//*[@id=\"cars\"]/form/div[4]/div/select/option[12]");
	By droptime=By.xpath("//select[contains(@name,'dropoffTime')]");
	By dropretime=By.xpath("//*[@id=\"cars\"]/form/div[6]/div/select/option[18]");
	By searchcar=By.xpath("//*[@id=\"cars\"]/form/div[7]/button");
	
	//tour booking page
	By tourbook=By.xpath("//*[@id=\"body-section\"]/div[3]/div[2]/div[2]/div/form/div[4]/button");
	By tourfirstname=By.xpath("//input[@placeholder='First Name']");
	By tourlastname=By.xpath("//input[@placeholder='Last Name']");
	By touremail=By.xpath("//div[@class='col-md-5 col-xs-12']//input[@placeholder='Email']");
	By tourcon=By.xpath("//input[@placeholder='Confirm Email']");
	By tourphone=By.xpath("//input[@placeholder='Contact Number']");
	By touradd=By.xpath("//input[@placeholder='Address']");
	By tourcoun=By.xpath("//input[@class='select2-input']");
	By tourci=By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div");
    //launch the Browser
    public void launchbrowser() throws InterruptedException, IOException {
		
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		 
			
	
	
	}


	
}