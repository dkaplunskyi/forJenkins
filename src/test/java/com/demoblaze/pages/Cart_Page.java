package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class Cart_Page {

    @FindBy(css = "#page-wrapper > div > div.col-lg-1 > button")
    private WebElement place_order_btn;

    @FindBy(xpath = "//*[@id='tbodyid']/tr/td[4]/a")
    private WebElement delete_btn;

    @FindBy(css = "#tbodyid>tr")
    private WebElement parent_element;

    public WebElement getParent_element() {
        return parent_element;
    }

    public WebElement getDelete_btn() {
        return delete_btn;
    }

    public WebElement getPlace_order_btn() {
        return place_order_btn;
    }

    public Cart_Page() {
        PageFactory.initElements(driver, this);
    }
}
