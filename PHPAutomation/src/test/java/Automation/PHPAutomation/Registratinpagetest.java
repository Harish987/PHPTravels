package Automation.PHPAutomation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Registratinpagetest extends  RegistrationpageTest
{
	Base b=new Base();
    @Test
 
public void testcase1() throws Exception, IOException {
    	b.launchbrowser();
    	 testcase();
}
}