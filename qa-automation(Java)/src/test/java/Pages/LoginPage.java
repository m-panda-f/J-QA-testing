package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By eyeIcon = By.xpath("//img[@class='passowrd-visible']");
    private By errorMessage = By.xpath("//div[@class='invalid-credential-div']");
    private By logoImage = By.xpath("//img[contains(@alt,'logo')]");

    // Actions
    public void enterEmail(String email) {
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void togglePasswordVisibility() {
        driver.findElement(eyeIcon).click();
    }

    // Checks
    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isPasswordMasked() {
        WebElement passwordField = driver.findElement(passwordInput);
        return passwordField.getAttribute("type").equals("password");
    }

    public boolean isEmailFieldPresent() {
        return driver.findElement(emailInput).isDisplayed();
    }

    public boolean isPasswordFieldPresent() {
        return driver.findElement(passwordInput).isDisplayed();
    }

    public boolean isEyeIconPresent() {
        return driver.findElement(eyeIcon).isDisplayed();
    }

    public boolean isLoginButtonPresent() {
        return driver.findElement(loginButton).isDisplayed();
    }

    public boolean isLogoPresent() {
        return driver.findElement(logoImage).isDisplayed();
    }

    public String getInvalidLoginError() {
        WebElement error = driver.findElement(errorMessage);
        return error.isDisplayed() ? error.getText() : "";
    }
}
