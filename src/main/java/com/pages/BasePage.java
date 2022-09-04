package com.pages;

import com.driver.DriverManager;

public class BasePage {

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

}
