package resources;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import DriverManager.DriverManager;

public class BaseTest{

	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public void setDriver(WebDriver driver) {
		this.driver.set(driver);
	}

	protected WebDriver getDriver() {
		return this.driver.get();
	}

	@BeforeMethod
	public void startDriver() throws IOException {
	setDriver(new DriverManager().initializeDriver());
		System.out.println("Current thread" + Thread.currentThread().getId() + ", " + "Driver" + getDriver());

	}

	@AfterMethod
	public void quitDriver() {
		System.out.println("Current thread" + Thread.currentThread().getId() + ", " + "Driver" + getDriver());
		getDriver().quit();

	}

}
