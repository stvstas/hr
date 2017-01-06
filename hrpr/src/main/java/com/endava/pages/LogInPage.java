package com.endava.pages;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by andpopescu on 1/5/2017.
 */
public class LogInPage {
    private WebDriver driver;

    public LogInPage(WebDriver driver){
        this.driver = driver;
        this.driver.get("https://www.linkedin.com/");
    }

    @FindBy(xpath = "//input[@id='login-email']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@id='login-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='login-submit']")
    private WebElement signInButton;

    public HomePage accountLogIn(String username, String password){
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        signInButton.click();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        return homePage;
    }


}
