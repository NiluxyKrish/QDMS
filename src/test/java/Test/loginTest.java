package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.loginPage;
import base.initial;

public class loginTest extends initial {
	loginPage loginpg=new loginPage();
	
	 @Test
	public void login() {
	  
	  PageFactory.initElements(driver,loginpg);
	  loginPage.username.sendKeys("admin");
	  loginPage.password.sendKeys("tokyo@admin");
	  loginPage.loginButton.click();
	
	}
	 
}

