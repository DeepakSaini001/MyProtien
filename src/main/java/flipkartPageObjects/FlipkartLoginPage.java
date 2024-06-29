package flipkartPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BasePage;

public class FlipkartLoginPage extends BasePage {


	private final By username = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	private final By password = By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	private final By Login = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");

	public FlipkartLoginPage(WebDriver driver) {
		super(driver);
	}

	public FlipkartLoginPage enterUserName() {
		driver.findElement(username).sendKeys("");
		return this;
	}

	public FlipkartLoginPage enterpassword() {
		driver.findElement(password).sendKeys("");
		return this;
	}

	public FlipkartHomePageSearch clickLogin() {
		driver.findElement(Login).click();
		return new FlipkartHomePageSearch(driver);
	}
}
