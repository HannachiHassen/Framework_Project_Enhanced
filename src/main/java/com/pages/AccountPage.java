package com.pages;

import org.openqa.selenium.By;

import com.enums.WaitStrategy;

public final class AccountPage extends BasePage {
	
	private final By linkDropDown=By.xpath("//p[@class='oxd-userdropdown-name']");
	private final By linkLogout=By.xpath("//a[contains(text(),'Logout')]");	
	private final By editAccountLink=By.xpath("//a[contains(text(),'Edit your account information')]");
	
	public By editYourAccountInformation() {
		return editAccountLink;		
	}
	
	public AccountPage clickDropDown() {
		click(linkDropDown, WaitStrategy.PRESENCE, "clickDropDown ");
		return this;
	}
	
	public LogoutPage clickLogout() {		
		click(linkLogout, WaitStrategy.CLICKABLE, "Logout button");
		return new LogoutPage();
	}
}
