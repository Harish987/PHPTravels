package Automation.PHPAutomation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Loginpagetest extends Loginpage
{
	Base b=new Base();
    @Test
 
public void testcase2() throws Exception, IOException {
    	b.launchbrowser();
    	testcase1(); 
}
}