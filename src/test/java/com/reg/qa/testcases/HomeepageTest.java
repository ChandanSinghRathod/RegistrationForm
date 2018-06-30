package com.reg.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reg.qa.base.TestBase;
import com.reg.qa.regpage.HomeePage;
import com.reg.qa.regpage.Regpage;
import com.reg.qa.util.TestUtil;

public class HomeepageTest extends TestBase {
	Regpage rp;
	TestUtil tu;
	HomeePage hp;
	public HomeepageTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();// i called initialization class as pre-requite of test
		// now i'll will create obejt of RegPage class so I'll define at class level
		tu=new TestUtil();
		rp= new Regpage();
		hp=rp.fillform(prop.getProperty("fname"),prop.getProperty("lname"),prop.getProperty("department"),prop.getProperty("uname"),prop.getProperty("pwd"),prop.getProperty("cpwd"),prop.getProperty("em"),prop.getProperty("cn"));
	}
	@Test(priority=1)
	public void HomeepageTileTest(){
		String title= HomeePage.verifyregpagetitle();
		Assert.assertEquals(title, "Thanks");
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
}
