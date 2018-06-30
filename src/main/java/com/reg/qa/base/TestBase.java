package com.reg.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.reg.qa.util.TestUtil;

//import com.crm.qa.util.TestUtil;



public class TestBase {
	
	public static  WebDriver driver;//class variables or global level variable
	public static Properties prop;//class variables or global level variable
	//NOW create constructor of class and read property property file
	public TestBase()    {
		try{
			prop=new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/reg/qa/config/config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//purpose of initialization method I'll write the code to read property file browser
	public static void initialization(){
		
		String browserName = prop.getProperty("browser");
		//if browser name is chrome i'll write system property of chrome
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:/Users/Ckumarsi/Desktop/Selenium Workshop/chromedriverwin32/chromedriver.exe");
			 
			 driver=new ChromeDriver();
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", ("user.dir")+"C://Users//Ckumarsi//Desktop//Selenium Workshop//geckodriver//geckodriver.exe");
			 
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
	}

}
