package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

  
    @FindBy(id = "username")          
    private WebElement txtUsername;

    @FindBy(id = "password")          
    private WebElement txtPassword;

    @FindBy(id = "loginButton")       
    private WebElement btnLogin;

    public void enterUsername(String username) {
        try {
            txtUsername.clear();
            txtUsername.sendKeys(username);
        } catch (Exception e) {
            Assert.fail("Error entering username: " + e.getMessage());
        }
    }

    public void enterPassword(String password) {
        try {
            txtPassword.clear();
            txtPassword.sendKeys(password);
        } catch (Exception e) {
            Assert.fail("Error entering password: " + e.getMessage());
        }
    }

    public void clickLogin() {
        try {
            btnLogin.click();
        } catch (Exception e) {
            Assert.fail("Error clicking login button: " + e.getMessage());
        }
    }


    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }


    public void verifyLoginSuccess(String expectedTitle) {
        try {
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "❌ Login failed! Page title mismatch.");
            System.out.println("✅ Login successful: " + actualTitle);
        } catch (Exception e) {
            Assert.fail("Error verifying login success: " + e.getMessage());
        }
    }
}
