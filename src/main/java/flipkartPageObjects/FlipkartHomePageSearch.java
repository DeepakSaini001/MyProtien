package flipkartPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BasePage;

public class FlipkartHomePageSearch extends BasePage {
	
	private final By Search = By.xpath("//input[@placeholder='Search for products, brands and more']");

	public FlipkartHomePageSearch(WebDriver driver) {
		super(driver);

	}

	public FlipkartHomePageSearch SearchBar() {
		driver.findElement(Search);
		return this;
	}

}
