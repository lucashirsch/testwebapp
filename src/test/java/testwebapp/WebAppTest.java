package testwebapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class WebAppTest {

    @Test
	public void testGetMessage() {
    	assertTrue(TestWebApp.getMessage() == "This is an edit to check the web page!");
    }
   
}