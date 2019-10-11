package Automation.PHPAutomation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Carpagetest extends Carpage 
{
	Base b=new Base();
    @Test
 
public void testcase5() throws Exception, IOException {
    	b.launchbrowser();
    	testcase4();
}
}