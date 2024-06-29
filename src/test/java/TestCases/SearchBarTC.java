package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import flipkartPageObjects.FlipkartHomePageSearch;
import resources.BasePage;
import resources.BaseTest;

public class SearchBarTC extends BaseTest {
	
	public WebDriver driver;
	
	@Test
	public void homepage () {
		FlipkartHomePageSearch homepage= new FlipkartHomePageSearch(getDriver());
		homepage.SearchBar();
	
	}

}
