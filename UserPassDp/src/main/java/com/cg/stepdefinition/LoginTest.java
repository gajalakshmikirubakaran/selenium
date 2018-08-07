package com.cg.stepdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.loginbean.BeanUserPass;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	 WebDriver driver=null;
	 private BeanUserPass pageBean;
	//Logger logger = Logger.getLogger(LoginTest.class.getName());
	@Before
	public  void init() {
		System.setProperty("webdriver.chrome.driver","D:\\sri\\selenium\\chromedriver.exe");
		
	}
	
	@Given("^I have a username and password$")
	public void i_have_a_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		pageBean=new BeanUserPass();
		PageFactory.initElements(driver, pageBean);
		
		
		driver.get("http://localhost:4011/UserPass/UserPass.html");
		
		
	}

	@When("^I provide username and password$")
	public void i_provide_username_and_password() throws Throwable {
		pageBean.setUsername("gaja");
		pageBean.setPassword("gaja");
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^I could be able to login$")
	public void i_could_be_able_to_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		pageBean.clicksub();
	}

}
