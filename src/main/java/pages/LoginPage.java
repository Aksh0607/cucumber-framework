package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Links;

public class LoginPage {

	private WebDriver driver;

	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickSubmit() {
		driver.findElement(loginButton).click();
	}

	public boolean isHomePageVisible() {
		return driver.findElement(By.id("inventory_container")).isDisplayed();
	}
	
	public void openLoginPage() {
		driver.get(Links.BASE_URL);
	}
}
