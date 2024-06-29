package TestCases;

import java.io.IOException;

import resources.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import flipkartPageObjects.FlipkartHomePageSearch;
import flipkartPageObjects.FlipkartLoginPage;
import resources.BasePage;

public class LoginPageTC extends BaseTest {

	@Test
	public void LoginPart() {

		FlipkartLoginPage login = new FlipkartLoginPage(getDriver());
		login.enterUserName().enterpassword().clickLogin();

	}

	@Test
	public void homepage() {
		FlipkartHomePageSearch homepage = new FlipkartHomePageSearch(getDriver());
		// homepage.SearchBar().sendKeys("Iphone");
		homepage.SearchBar();

	}

}
