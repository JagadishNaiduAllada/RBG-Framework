package pagePackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class FbLoginWithExcelPage extends BaseTest
{
	
        public WebDriver driver;
	    public FbLoginWithExcelPage (WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    	
	    }

	    @FindBy(xpath="//input[@id='email']")
	    WebElement userId;
	    @FindBy(xpath="//input[@id='pass']")
	    WebElement password;
	    @FindBy(xpath="//button[@id='loginbutton']")
	    WebElement loginButton;

	   GenericKeywordsWithPage page = new GenericKeywordsWithPage("FbLoginWithExcelPage");

	   public void enterUserName(String user) 
	   {
		   page.enterData(userId,user);
	   }
	   public void enterPassword(String pass) 
	   {
		   page.enterData(password,pass);
	   }
	   public void loginButton() 
	   {
		   page.click(loginButton);
	   }

	}


