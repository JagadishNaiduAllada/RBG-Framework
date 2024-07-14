package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class Guru99Page 
{
public WebDriver driver;
    public Guru99Page(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    	
    }

    @FindBy(xpath="//input[@name='cusid']")
    WebElement CustomerID;
    @FindBy(xpath="//input[@type='submit']")
    WebElement submit;
   //@FindBy(xpath="//input[@id='pass']")
   // WebElement password;
   // @FindBy(xpath="//button[@id='loginbutton']")
   //WebElement loginButton;

   GenericKeywordsWithPage page = new GenericKeywordsWithPage("FacebookPage");

   public void enterCustomerID(String user) 
   {
	   page.enterData(CustomerID,user);
   }
   public void submitButton()
   {
	page.submitButton(submit); 
   }
   public void verifyCustomerID(String c) throws Exception
   {
	   page.getAttribute(CustomerID, c);
			   }
  /* public void enterPassword(String pass) 
   {
	   page.enterData(password,pass);
   }
   public void loginButton() 
   {
	   page.click(loginButton);
   }*/

}
