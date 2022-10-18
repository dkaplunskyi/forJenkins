package com.demoblaze.steps;

import com.demoblaze.pages.Cart_Page;
import com.demoblaze.pages.Home_Page;
import com.demoblaze.pages.Product_Page;
import com.demoblaze.pages.model_windows.CartForm_Modal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.demoblaze.base.Hooks.driver;

public class Shopping_cart_Steps {

    @When("select a product on home page")
    public void selectAProductOnHomePage()  {
        Home_Page home_page = new Home_Page();
        home_page.getProduct_element().click();
    }

    @Then("click on Add to cart button")
    public void clickOnAddToCartButton() throws InterruptedException {
        Product_Page product_page = new Product_Page();
        product_page.getAdd_to_cart_btn().click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }


    @Then("click Cart link on the header")
    public void clickCartLinkOnTheHeader()  {
        Home_Page home_page = new Home_Page();
        home_page.getCart_link().click();
    }

    @Then("click to Place Order button")
    public void clickToPlaceOrderButton()  {
        Cart_Page cart_page = new Cart_Page();
        cart_page.getPlace_order_btn().click();
    }

    @Then("fill out the form")
    public void fillOutTheForm() {
        CartForm_Modal cartForm_modal = new CartForm_Modal();
        cartForm_modal.getName_textField().sendKeys("Julia");
        cartForm_modal.getCountry_textField().sendKeys("russia");
        cartForm_modal.getCity_textField().sendKeys("moscow");
        cartForm_modal.getCard_textField().sendKeys("77712377709876");
        cartForm_modal.getMonth_textField().sendKeys("12");
        cartForm_modal.getYear_textField().sendKeys("2022");
    }

    @Then("click Purchase button")
    public void clickPurchaseButton()  {
        CartForm_Modal cartForm_modal = new CartForm_Modal();
        cartForm_modal.getPurchase_btn().click();
    }

    @And("verify that the order placed successfully")
    public void verifyThatTheOrderPlacedSuccessfully() {
        String result = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2")).getText();
        Assert.assertTrue(result.contains("Thank you for your purchase!"));
    }

    @And("verify that the item added to cart")
    public void verifyThatTheItemAddedToCart() {
        Cart_Page cart_page = new Cart_Page();
        WebElement parent_element = cart_page.getParent_element();
        int size = parent_element.findElements(By.tagName("td")).size();
        System.out.println(size);
        Assert.assertTrue(size > 0);
    }

    @And("verify that the item deleted from cart")
    public void verifyThatTheItemDeletedFromCart() {
        Cart_Page cart_page = new Cart_Page();
        WebElement parent_element = cart_page.getParent_element();
        int size = parent_element.findElements(By.tagName("td")).size();
        System.out.println(size);
        Assert.assertEquals(size, 0);
    }

    @Then("click delete button")
    public void clickDeleteButton() {
        Cart_Page cart_page = new Cart_Page();
        cart_page.getDelete_btn().click();
    }
}
