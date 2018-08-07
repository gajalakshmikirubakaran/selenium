package com.cg.loginbean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BeanUserPass {
	
	
	
	@FindBy(how=How.ID,id="username")
	private WebElement user;
	
	
	@FindBy(how=How.ID,id="password")
	private WebElement pass;
	
	
	@FindBy(how=How.ID,id="sub")
	private WebElement submit;
	
	@FindBy(how=How.ID,id="can")
	private WebElement cancel;

	public String getUsername() {
		return user.getAttribute("value");
	}

	public void setUsername(String username) {
		this.user.sendKeys(username);
	}

	public String getPassword() {
		return pass.getAttribute("value");
	}

	public void setPassword(String password) {
		this.pass.sendKeys(password);
	}

	public void clicksub() {
		submit.click();
	}
	public void clickcan() {
		cancel.click();
	}
	
	


}
