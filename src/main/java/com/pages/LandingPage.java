package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class LandingPage extends BasePage{

	private LandingPage() {
		
	}
	
	private final By myAccountDropDown=By.xpath("//span[contains(text(),'My Account')]");
	private final By loginOption=By.xpath("//a[contains(text(),'Login')]");
	
	public LandingPage myAccountDropDown() {
		return this;		
	}
		
	public LandingPage loginOption() {
		return this;
	}	

}
