package com.demoblaze.pages.model_windows;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class Contact_Modal {

    @FindBy(css = "#recipient-email")
    private WebElement recipient_email_textField;

    @FindBy(css = "#recipient-name")
    private WebElement recipient_name_textField;

    @FindBy(css = "#message-text")
    private WebElement message_textField;

    @FindBy(css = "button[onclick='send()']")
    private WebElement sendMessage_btn;

    public WebElement getRecipient_email_textField() {
        return recipient_email_textField;
    }

    public WebElement getRecipient_name_textField() {
        return recipient_name_textField;
    }

    public WebElement getMessage_textField() {
        return message_textField;
    }

    public WebElement getSendMessage_btn() {
        return sendMessage_btn;
    }

    public Contact_Modal() {
        PageFactory.initElements(driver, this);
    }
}
