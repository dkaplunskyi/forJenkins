package com.demoblaze.pages.model_windows;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class Login_Modal {

    @FindBy(css = "#loginusername")
    private WebElement username_textField;

    @FindBy(css = "#loginpassword")
    private WebElement password_textField;

    @FindBy(css = "button[onclick='logIn()']")
    private WebElement login_btn;

    @FindBy(css = "#nameofuser")
    private WebElement nameOfUser_element;

    public WebElement getNameOfUser_element() {
        return nameOfUser_element;
    }

    public WebElement getLogin_btn() {
        return login_btn;
    }

    public WebElement getUsername_textField() {
        return username_textField;
    }

    public WebElement getPassword_textField() {
        return password_textField;
    }

    public Login_Modal() {
        PageFactory.initElements(driver, this);
    }
}
