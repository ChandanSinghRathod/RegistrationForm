package com.reg.qa.regpage;

import org.openqa.selenium.support.PageFactory;

import com.reg.qa.base.TestBase;
import com.reg.qa.util.TestUtil;
//Author is chandan
public class HomeePage extends TestBase{
	
	Regpage rp;
	TestUtil tu;
	
	
	public HomeePage(){
		
		PageFactory.initElements(driver, this);
	}
	public static  String verifyregpagetitle(){
	
		return driver.getTitle();
	}

}
