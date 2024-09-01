package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class registerfree extends BaseLibrary{
	public registerfree() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Enter your email address here']")
	private WebElement Email;
	@FindBy(xpath="//input[@id='Form_submitForm_action_request']")
	private WebElement formsubmit;
	@FindBy(xpath="	//input[@id='Form_getForm_subdomain']")
	private WebElement username;
	@FindBy(xpath="	//input[@id='Form_getForm_Name']")
	private WebElement name;
	@FindBy(xpath="	//input[@id='Form_getForm_Email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='Form_getForm_Contact']")
	private WebElement contact;
	@FindBy(xpath="//select[@id='Form_getForm_Country']")
	private WebElement countrydown;
	@FindBy(xpath="//option[@value='India']")
	private WebElement india;
	
	
	public void submit() {
	formsubmit.click();
	}
	public void writeusername() {
		username.sendKeys("anshu");
	}
	public void writename() {
		name.sendKeys("anshuman");
	}
	public void writeemail() {
		email.sendKeys("anshuman@gmail.com");
	}
	public void writecontact() {
		contact.sendKeys("6398142182");
	}
	public void selectcountry() {
		countrydown.click();
		india.click();
	}

}




