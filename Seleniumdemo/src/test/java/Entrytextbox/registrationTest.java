package Entrytextbox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import baselibrary.BaseLibrary;
import pages.registerfree;
import pages.registerpage;

public class registrationTest extends BaseLibrary {
	registerfree ob;
	
	@BeforeTest
	public void LaunchURl(){
		launchurl();
		ob=new registerfree();
	}
    @Test(priority=1)
    public void submit() {
  	ob.submit();
    }
    @Test(priority=2)
    public void writeUsername() {
      ob.writeusername();  
    }
    @Test(priority=3)
    public void writeName() {
  	ob.writename();

    }

    @Test(priority=4)
    public void writeEmail() {
  	ob.writeemail();

    } @Test(priority=5)
    public void writeContact() {
  	ob.writecontact();

    } @Test(priority=6)
    public void selectCountry() {
  	ob.selectcountry();
   }}
