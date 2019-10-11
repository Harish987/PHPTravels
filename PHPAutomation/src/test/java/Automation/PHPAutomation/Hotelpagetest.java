package Automation.PHPAutomation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Hotelpagetest extends Hotelpage
{    Base b=new Base();
    @Test
 
public void testcase3() throws Exception, IOException {
    	b.launchbrowser();
    	testcase2();
	
		
}
	
}
