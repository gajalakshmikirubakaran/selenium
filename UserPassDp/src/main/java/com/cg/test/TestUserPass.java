package com.cg.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue= {"com.cg.stepdefinition"},
		tags= {"@execute"}
	)

public class TestUserPass {

}
