package com.demoblaze.pages.model_windows;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class CartForm_Modal {

    @FindBy(css = "#name")
    private WebElement name_textField;

    @FindBy(css = "#country")
    private WebElement country_textField;

    @FindBy(css = "#city")
    private WebElement city_textField;

    @FindBy(css = "#card")
    private WebElement card_textField;

    @FindBy(css = "#month")
    private WebElement month_textField;

    @FindBy(css = "#year")
    private WebElement year_textField;

    @FindBy(css = "button[onclick='purchaseOrder()']")
    private WebElement purchase_btn;

    public WebElement getPurchase_btn() {
        return purchase_btn;
    }

    public WebElement getName_textField() {
        return name_textField;
    }

    public WebElement getCountry_textField() {
        return country_textField;
    }

    public WebElement getCity_textField() {
        return city_textField;
    }

    public WebElement getCard_textField() {
        return card_textField;
    }

    public WebElement getMonth_textField() {
        return month_textField;
    }

    public WebElement getYear_textField() {
        return year_textField;
    }

    public CartForm_Modal() {
        PageFactory.initElements(driver, this);
    }
}
