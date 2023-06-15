package com.neosoft.demowebshop.hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import com.neosoft.demowebshop.utility.Common;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	
	Properties pro= new Properties();
	
	@Before
	public void m1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver_win32 (2)\\chromedriver.exe");
		Common.driver= new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Neosoft\\eclipse-workspace\\__NeosoftCucumberAssignment\\src\\test\\java\\com\\neosoft\\demowebshop\\data\\data.properties");
		pro.load(fis);
		
		Common.driver.get(pro.getProperty("url"));
		
		Common.driver.manage().window().maximize();
		
		
	}
	
	
	@After
	
	public void m2()
	{
		Common.driver.close();
	}

}
