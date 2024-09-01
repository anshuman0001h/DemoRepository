package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class registerpage extends BaseLibrary {
	public registerpage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement MyAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement Register;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lastname ;
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email ;
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password ;
      @FindBy(xpath="//input[@id='input-newsletter-no']")
      private WebElement Notag;
      @FindBy(xpath=" //input[@name='agree']")
      private WebElement Agree;
      
      @FindBy(xpath=" //button[text()='Continue'] ")
      private WebElement Continue;
      
      
      public void clickonMyaccount() {
    	MyAccount.click();
      }
      public void clickonRegister() {
    	  Register.click();
      }
    	   public void fillDetails() {
    		   Firstname.sendKeys(readdata(0,1,0));
    		   Lastname.sendKeys(readdata(0,1,2));
    		   Email.sendKeys(readdata(0,1,3));
    	      Password.sendKeys(readdata(0,1,4));
    	      Notag.click();
    	      Agree.click();
    	      Continue.click();
    	      }
    	 
      
}
