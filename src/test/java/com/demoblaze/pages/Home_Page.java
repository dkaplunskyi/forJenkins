package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class Home_Page {

    @FindBy(css = "#navbarExample > ul > li:nth-child(2) > a")
    private WebElement contact_link;

    @FindBy(css = "#login2")
    private WebElement login_link;

    @FindBy(css = "#signin2")
    private WebElement signin_link;


    @FindBy(css = "#tbodyid > div:nth-child(1) > div > div > h4 > a")
    private WebElement product_element;

    @FindBy(css = "#cartur")
    private WebElement cart_link;

    public WebElement getCart_link() {
        return cart_link;
    }

    public WebElement getProduct_element() {
        return product_element;
    }

    public WebElement getSignin_link() {
        return signin_link;
    }

    public WebElement getLogin_link() {
        return login_link;
    }

    public WebElement getContact_link() {
        return contact_link;
    }

    public Home_Page() {
        PageFactory.initElements(driver, this);
    }
}
