package Automation.PHPAutomation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Flightpagetest  extends Flightpage 
{
Base b=new Base();
@Test

public void testcase() throws Exception, IOException {
    	b.launchbrowser();
    	testcase3();


}
}