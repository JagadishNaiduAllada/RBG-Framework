package testPackage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

import pagePackage.FbLoginWithExcelPage;
public class FbLoginExcelTest extends BaseTest 
{
	
    FbLoginWithExcelPage page;
		SoftAssert s_assert = new SoftAssert();
			PropertySingleton _instance = null;
			

		    public FbLoginExcelTest() throws Throwable 
			{
				_instance = PropertySingleton.getInstance();
				page = new FbLoginWithExcelPage(GenericKeywordsWithPage.driver);
			}
			@BeforeClass
			public void startReport()
			{
				beforeClassForChild(this);
				
			}

			@Test(dataProvider="setData1")
			public void Menutest1(Hashtable<String, String> h1) throws Throwable 
			{
			extentLoggerECP = parentExtentLogger.createNode("Home Page Test");
			page = new FbLoginWithExcelPage(GenericKeywordsWithPage.driver); 
			page.enterUserName(h1.get("UserName"));
			passLog();
			page.enterPassword(h1.get("UserPassword"));
			
			s_assert.assertAll();
			
			
			}
			
			@DataProvider
			public Object[][] setData1() {
				Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
				return ReadData.getData("FB_Login", "Fb_Credentials", xls);	
			}
	}

