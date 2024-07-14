package testPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import pagePackage.Guru99Page;

public class Guru9Test extends BaseTest
{

	Guru99Page page;
	SoftAssert s_assert = new SoftAssert();
		PropertySingleton _instance = null;
		
	
	    public Guru9Test() throws Throwable 
		{
			_instance = PropertySingleton.getInstance();
			page = new Guru99Page(GenericKeywordsWithPage.driver);
		}
		@BeforeClass
		public void startReport()
		{
			beforeClassForChild(this);
			
		}

		@Test
		public void Menutest1() throws Throwable 
		{
		extentLoggerECP = parentExtentLogger.createNode("Home Page Test");
		page = new Guru99Page(GenericKeywordsWithPage.driver); 
		page.enterCustomerID("2263");
		//page.enterPassword("123456");
		//page.loginButton();
		page.submitButton();
		page.verifyCustomerID("x");
		s_assert.assertAll();
		
		
		}
		
		

}