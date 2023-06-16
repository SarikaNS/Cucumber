package com.neosoft.demowebshop.step;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.neosoft.demowebshop.utility.Common;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginResStep {
	
	static Logger log=Logger.getLogger(LoginResStep.class);
	
	
	@Given("^Click on register$")
	public void registerClick()
	{
	   Common.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   Common.driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	@When("^Select gender as female$")
	public void selectGender()
	{
	   Common.driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	}

	@And("^Enter first name as \"([^\"]*)\"$") 
	public void enterFname (String fname)
	{
		Common.driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fname);
	}

	@And("^Enter last name as \"([^\"]*)\"$") 
	public void enterLname(String lname)
	{
		Common.driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lname);
	}

	@And("^Enter email as \"([^\"]*)\"$")
	public void enterEmail(String email)
	{
		Common.driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	}

	@And("^Enter password as \"([^\"]*)\"$")
	public void enterPassword(String password)
	{
		Common.driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}

	@And("^Enter confirm password as \"([^\"]*)\"$")
	public void enterConPassword(String conpassword)
	{
		Common.driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(conpassword);
	}

	@Then("^Click on Register$")
	public void clickRegister() throws InterruptedException
	{
		Common.driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		Thread.sleep(5000);
		
		Assert.assertEquals("https://demowebshop.tricentis.com/registerresult/1", Common.driver.getCurrentUrl());
		
		log.info("-----------Registration completed--------------------");
		
	}

	//----------------------------
	
	@Given("^Click on login1$")
	public void m1()
	{
	   Common.driver.findElement(By.xpath("//a[text()='Log in']")).click();  
	}

	@When("^Enter username1 as \"([^\"]*)\"$")
	public void enterUn(String un)
	{
		Common.driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(un);
	}
	
	@And("^Enter password1 as \"([^\"]*)\"$")
	public void enterPw(String pw)
	{
		Common.driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pw);
	}

	@Then("^Click on Login1$")
	
	public void login1() 
	{
		Common.driver.findElement(By.xpath("//input[@value='Log in']")).click(); 
		
		
		Assert.assertTrue(Common.driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed());
		
		
		log.info("--------------Valid login scenario checked---------------");
		
		
	}
	
	
	
	
	//----------------------------------

	/*
	@Given("^Click on login2$")
	public void m11()
	{
		 Common.driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@When("^Enter username2 as \"([^\"]*)\"$")
	public void enterUn1(String un)
	{
		 Common.driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(un);;
	}
	
	@And("^Enter password2 as \"([^\"]*)\"$")
	public void enterPw1(String pw)
	{
		 Common.driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pw);;
	}

	@Then("^Click on Login2$")
	public void login11() 
	{
		 Common.driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	*/
	

}
	
	
