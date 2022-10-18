package com.demoblaze.pages.model_windows;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class SignUp_Modal {

    @FindBy(css = "#sign-username")
    private WebElement username_textField;

    @FindBy(css = "#sign-password")
    private WebElement password_textField;

    @FindBy(css = "button[onclick='register()']")
    private WebElement signUp_btn;

    @FindBy(css = "#nameofuser")
    private WebElement nameOfUser_element;

    public WebElement getUsername_textField() {
        return username_textField;
    }

    public WebElement getPassword_textField() {
        return password_textField;
    }

    public WebElement getSignUp_btn() {
        return signUp_btn;
    }

    public WebElement getNameOfUser_element() {
        return nameOfUser_element;
    }

    public SignUp_Modal() {
        PageFactory.initElements(driver, this);
    }
}
