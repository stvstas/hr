package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by andpopescu on 1/5/2017.
 */
public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='main-search-box']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class = 'search-button']")
    private WebElement searchButton;

    public void searchContact(){

        searchField.sendKeys("");
        searchButton.click();
    }
}
