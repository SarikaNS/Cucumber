package com.neosoft.demowebshop.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Neosoft\\eclipse-workspace\\___1NeosoftCucumberAssignment\\src\\test\\resources"} ,
				glue= {"com.neosoft.demowebshop.step" , "com.neosoft.demowebshop.utility", "com.neosoft.demowebshop.hooks" , "com.neosoft.demowebshop.runner" , "com.neosoft.demowebshop.logger"} , 
				tags= {"@tag1, @tag2"} ,
				plugin = {"pretty" , "html:target/cucumber-report"},
				monochrome = true
				)

public class Runner {

}