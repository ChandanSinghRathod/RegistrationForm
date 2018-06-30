package com.reg.qa.regpage;

//Author is chandan singh

//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.reg.qa.base.TestBase;

public class Regpage extends TestBase {

	//Here we need to create page factory or Object repository using @ annotation
	@FindBy(xpath="//label[contains(text(),'First Name')]")
	WebElement firstnamelabel;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	@FindBy(xpath="//label[contains(text(),'Last Name')]")
	WebElement lastnamelable;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;
	@FindBy(xpath="//select[@name='department']")
	WebElement dpt;
	@FindBy(xpath="//label[contains(text(),'Username ')]")
	WebElement usernamelabel;
	@FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	@FindBy(xpath="//small[contains(text(),'This value is not valid')]")
	WebElement errmsg;
	@FindBy(xpath="//input[@name='user_password']")
	WebElement userpassword;
	@FindBy(xpath="//label[contains(text(),'Password ')]")
	WebElement passwrdlabel;
	@FindBy(xpath="//label[contains(text(),'Confirm Password')]")
	WebElement cnfrmpwdlabel;
	@FindBy(xpath="//input[@name='confirm_password']")
	WebElement confirmpassword;
	@FindBy(xpath="//label[contains(text(),'E-Mail')]")
	WebElement emaillable;
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	@FindBy(xpath="//label[contains(text(),'Contact No.')]")
	WebElement cntnolabel;
	@FindBy(xpath="//input[@name='contact_no']")
	WebElement contact_no;
	@FindBy(xpath="//i[@class='glyphicon glyphicon-user']")
	WebElement flogo;
	@FindBy(xpath="//button[@type='submit']")
	WebElement sbmbtn;
	@FindBy(xpath="//i[@data-bv-icon-for='user_name']")
	WebElement crsicon;
	@FindBy(xpath="//i[@data-bv-icon-for='user_name']")
	WebElement checkicon;
	@FindBy(xpath="//small[contains(text(),'Please enter your First Name')]")
	WebElement errmsgblkfld;
	@FindBy(xpath="//i[@data-bv-icon-for='email']")
	WebElement validmailchk;
	@FindBy(xpath="//i[@data-bv-icon-for='contact_no']")
	WebElement cnvalid;
	
	//now i want to initialize webelement using constructor or initilizing page objectss
	
	public Regpage(){
		
		// "this" represents current class object)
		//dot init element method is available for this purpose
        //or all the variable or pagefactory will bw initialize with driver
				PageFactory.initElements(driver, this);
	}
	//Now I'll define my actions which is presents in Registration page ocreate method 
	
	
	//=========================================================//
	//Actions or different features avaiable to test
//	public String verifyregpagetitle(){
//		
//		return driver.getTitle();
//	}
	public boolean validatefirstnamelabel(){
		return firstnamelabel.isDisplayed();
		
		
		
	}
	
	public boolean validatelastnamelabel(){
		return lastnamelable.isDisplayed();
		
		
		
	}
	
	public boolean validateusernamelabel(){
		return usernamelabel.isDisplayed();
		
		
		
	}
	public boolean validatepasswordlabel(){
		return passwrdlabel.isDisplayed();
		
		
		
	}
	public boolean validatecnfrmpasswordlabel(){
		return cnfrmpwdlabel.isDisplayed();
		
		
		
	}
	public boolean validateemaillabel(){
		return emaillable.isDisplayed();
		
		
		
	}
	public boolean validatecontactnolabel(){
		return cntnolabel.isDisplayed();
		
		
		
	}
	
//public boolean validateUNlogo(){
//		
//		return flogo.isDisplayed();
//}
	
	public void enterfirstname(String fname){
		firstname.sendKeys(fname);
	}
	
	public void enterlastname(String lname){
		lastname.sendKeys(lname);
	}
	
	public void enterusername(String uname){
		username.sendKeys(uname);
	}
	public void enterpassword(String pwd){
		userpassword.sendKeys(pwd);
	}
	public void entercnfrmpassword(String cpwd){
		confirmpassword.sendKeys(cpwd);
	}
	public boolean enteremail(String em){
		email.sendKeys(em);
		return validmailchk.isDisplayed();
	}
//	public boolean entervalidemail(String em){
//		email.sendKeys(em);
//		return validmailchk.isDisplayed();
//	}
	public boolean entercontctno(String cn){
		contact_no.sendKeys(cn);
		return cnvalid.isDisplayed();
	}
	public boolean entervalidcontctno(String cn){
		contact_no.sendKeys(cn);
		return cnvalid.isDisplayed();
	}
	public boolean enterusernameincorrect(String iun){
		username.sendKeys(iun);
		return errmsg.isDisplayed();
		
	}
	
	public void enterunicodecharacterinusername(String uc){
		username.sendKeys(uc);
	}
	public boolean crossiconun(String iun){
		username.sendKeys(iun);
		
		return crsicon.isDisplayed();
	}
	
	public boolean checkiconforun(String un){
		username.sendKeys(un);
		
		return crsicon.isDisplayed();
	}
	
	public boolean unblankfield(){
		username.sendKeys("");
		return errmsgblkfld.isDisplayed();
		
	}
public HomeePage fillform(String fname, String lname,String department,String uname,String pwd,String cpwd,String em,String cn){
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
//	dpt.click();
	//here we need to select from drop down..so for drop down we use select class
//			Select select=new Select(driver.findElement(By.name("department")));
//			select.selectByVisibleText(department);
	username.sendKeys(uname);
	userpassword.sendKeys(pwd);
	confirmpassword.sendKeys(cpwd);
	email.sendKeys(em);
	contact_no.sendKeys(cn);
	sbmbtn.click();
	//since on clicking submitting button next page will come so return 
	//type will be that page i am considering it as home page later I'll change
	return new HomeePage();
	
	//Now I'll write test case for reg page in RegpageTest.java
	
	
	
	
	
}
}
