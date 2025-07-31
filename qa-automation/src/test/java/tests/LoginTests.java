package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test(priority = 1)
    public void testLoginButtonDisabledWhenFieldsAreEmpty() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertFalse(loginPage.isLoginButtonEnabled(), "❌ Login button should be disabled when fields are empty");
    }

    @Test(priority = 2)
    public void testPasswordMaskedByDefault() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword("secret123");
        Assert.assertTrue(loginPage.isPasswordMasked(), "❌ Password should be masked (type=password) by default");
    }

    @Test(priority = 3)
    public void testTogglePasswordVisibility() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword("secret123");
        loginPage.togglePasswordVisibility();
        Thread.sleep(1000); // Optional visual delay
        Assert.assertFalse(loginPage.isPasswordMasked(), "❌ Password should be visible after toggling eye icon");
    }

    @Test(priority = 4)
    public void testPresenceOfElements() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isEmailFieldPresent(), "❌ Email field should be present");
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "❌ Password field should be present");
        Assert.assertTrue(loginPage.isEyeIconPresent(), "❌ Eye icon should be present");
        Assert.assertTrue(loginPage.isLoginButtonPresent(), "❌ Login button should be present");
    }

    @Test(priority = 5)
    public void testInvalidLoginShowsError() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("wrong@example.com");
        loginPage.enterPassword("invalidpass");
        loginPage.clickLogin();
        Thread.sleep(2000); // Wait for error to appear

        String errorMsg = loginPage.getInvalidLoginError();
        System.out.println("⚠️ Captured error message: " + errorMsg);
        Assert.assertTrue(!errorMsg.isEmpty(), "❌ Error message should be shown for invalid login");
    }

    @Test(priority = 6)
    public void testLogoIsVisible() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isLogoPresent(), "❌ Janitri logo should be visible on the login page");
    }
}
