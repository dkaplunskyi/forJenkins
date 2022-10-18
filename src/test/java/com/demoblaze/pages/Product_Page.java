package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class Product_Page {

    @FindBy(css = "a[onclick='addToCart(1)']")
    private WebElement add_to_cart_btn;

    public WebElement getAdd_to_cart_btn() {
        return add_to_cart_btn;
    }

    public Product_Page() {
        PageFactory.initElements(driver, this);
    }
}
