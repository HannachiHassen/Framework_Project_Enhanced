package driver;

import java.util.Objects;

import org.openqa.selenium.firefox.FirefoxDriver;

import constants.FrameworkConstants;

public final class Driver {

	private Driver() {
		
	}	
	
	public static void initDriver() {
		if (Objects.isNull(DriverManager.getDriver())) {
			System.setProperty("webdriver.gecko.driver", FrameworkConstants.getGeckodriverpath());
			DriverManager.setDriver(new FirefoxDriver());
		}
		
		DriverManager.getDriver().get("");
	}
	

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}		
	}
}
