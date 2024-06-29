package resources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utils.ConfigLoader;

public class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected WebDriverWait waitLong;
	protected WebDriverWait waitShort;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		waitLong = new WebDriverWait(driver, Duration.ofSeconds(15)); // this wait object can be used further in each
																		// page
																		// object class
		waitShort = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	public void load(String endPoint) {
	
		driver.get(ConfigLoader.getInstance().getBaseUrl()+ endPoint); // this is in
		// the congifLoader file using singleton
	}

	public void waitForOverlaysToDisappear(By overlay) {
		List<WebElement> overlays = driver.findElements(overlay);
		System.out.println("OVERLAY SIZE" + "==" + overlays.size());
		if (overlays.size() > 0) {
			wait.until(ExpectedConditions.invisibilityOfAllElements(overlays));
			System.out.println("OVERLAYS INVISIBLE");
		} else {
			System.out.println("OVERLAY NOT FOUND");
		}
	}

	public WebElement waitForElementToBeVisible(By element) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	public Boolean verifyURLContains(String expectedString) {

		return wait.until(ExpectedConditions.urlContains(expectedString));
	}

}
