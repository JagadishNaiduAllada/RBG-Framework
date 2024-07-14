package testPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;

import pagePackage.FacebookPage;

public class FacebookTest extends BaseTest
{

	FacebookPage page;
	SoftAssert s_assert = new SoftAssert();
		PropertySingleton _instance = null;
		

	    public FacebookTest() throws Throwable 
		{
			_instance = PropertySingleton.getInstance();
			page = new FacebookPage(GenericKeywordsWithPage.driver);
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
		page = new FacebookPage(GenericKeywordsWithPage.driver); 
		page.enterUserName("jagadish");
		page.enterPassword("123456");
		page.loginButton();
		s_assert.assertAll();
		
		
		}
		
		

}