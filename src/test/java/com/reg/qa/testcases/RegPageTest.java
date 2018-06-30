package com.reg.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reg.qa.base.TestBase;
import com.reg.qa.regpage.HomeePage;
import com.reg.qa.regpage.Regpage;

public class RegPageTest extends TestBase {
	
	Regpage rp;
	HomeePage hmp;
	// create constructor of Regpae test coz super key word will come under 
	//Testbaseclass so we are calling test base class constructor
	public RegPageTest(){
		
		
		super();
	}
	//here I'll define my anotation
	@BeforeMethod
	public void setUp(){
		initialization();// i called initialization class as pre-requite of test
		// now i'll will create obejt of RegPage class so I'll define at class level
		rp=new Regpage();
	}
	
	// now I'll write my test cases here
	
	@Test(priority=1)
	
	public void firstnamelabelTest(){
		boolean flag=rp.validatefirstnamelabel();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void lastnamelabelTest(){
		boolean flag=rp.validatelastnamelabel();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void usernamelabelTest(){
		boolean flag=rp.validateusernamelabel();
		Assert.assertTrue(flag);
	}
	@Test(priority=4)
	public void passwordlabelTest(){
		boolean flag=rp.validatepasswordlabel();
		Assert.assertTrue(flag);
	}
	@Test(priority=5)
	public void cnfpasswordlabelTest(){
		boolean flag=rp.validatecnfrmpasswordlabel();
		Assert.assertTrue(flag);
	}
	@Test(priority=6)
	public void emaillabelTest(){
		boolean flag=rp.validateemaillabel();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void contactnolabelTest(){
		boolean flag=rp.validatecontactnolabel();
		Assert.assertTrue(flag);
	}
	@Test(priority=7)
	public void enterfnTest(){
		rp.enterfirstname(prop.getProperty("fname"));
		
	}
	@Test(priority=8)
	public void enterlnTest(){
		rp.enterlastname(prop.getProperty("lname"));
		
	}
	@Test(priority=9)
	public void enterunTest(){
		rp.enterusername(prop.getProperty("uname"));
		
	}
	@Test(priority=10)
	public void enterpwdTest(){
		rp.enterpassword(prop.getProperty("pwd"));
		
	}
	@Test(priority=11)
	public void entercpwdTest(){
		rp.entercnfrmpassword(prop.getProperty("cpwd"));
		
	}
	@Test(priority=12)
	public void enteremailTest(){
		rp.enteremail(prop.getProperty("em"));
		
		
	}
//	@Test(priority=13)
//	public void entervalidemailTest(){
//		rp.entervalidemail(prop.getProperty("em"));
//		
//	}
	@Test(priority=14)
	public void entercontactnoTest(){
		rp.enteremail(prop.getProperty("cn"));
		
	}
	@Test(priority=15)
	public void fillformtest(){
		
		
	hmp=	rp.fillform(prop.getProperty("fname"),prop.getProperty("lname"),prop.getProperty("department"),prop.getProperty("uname"),prop.getProperty("pwd"),prop.getProperty("cpwd"),prop.getProperty("em"),prop.getProperty("cn"));
	}
	

	@Test(priority=16)
	public void errormsgTest(){
		rp.enterusernameincorrect(prop.getProperty("iun"));
		
	}
	
	@Test(priority=15)
	public void UNCTest(){
		rp.enterunicodecharacterinusername(prop.getProperty("uc"));
		
	}
	
	@Test(priority=16)
	public void ChkIcnTest(){
		
		boolean flag=rp.checkiconforun(prop.getProperty("un"));
		Assert.assertTrue(flag);
		
	}
	@Test(priority=17)
	public void errormsgblankfieldusernameTest(){
		rp.unblankfield();
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
}
