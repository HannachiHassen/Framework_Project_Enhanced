package com.tests;

import org.assertj.core.api.Assertions;

import com.pages.LoginPage;

public final class TutorailsninjaTest extends BaseTest{

	private TutorailsninjaTest() {
		
	}
	

	public void loginLogoutTest(String username, String password) {    	
    	
    	String title= new LoginPage()
    			.enterEmailAddress(username).enterPassword(password).clicklogin()
    			.clickDropDown().clickLogout().clickLogout()
    			.getPageTitle();
 
    	Assertions.assertThat(title)
    	.isEqualTo("Your Store");
	}	

}
