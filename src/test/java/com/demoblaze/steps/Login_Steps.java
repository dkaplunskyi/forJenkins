package com.demoblaze.steps;

import com.demoblaze.pages.Home_Page;
import com.demoblaze.pages.model_windows.Login_Modal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoblaze.base.Hooks.driver;

public class Login_Steps {


    @Given("click login link on the header")
    public void click_login_link_on_the_header() throws InterruptedException {
        Home_Page home_page = new Home_Page();
        home_page.getLogin_link().click();
        Thread.sleep(1000);
    }

    @Then("enter valid username and password")
    public void enter_valid_username_and_password() {
        Login_Modal login_modal = new Login_Modal();
        login_modal.getUsername_textField().sendKeys("dk");
        login_modal.getPassword_textField().sendKeys("q1w2e3");
    }

    @Then("click login button")
    public void click_login_button() throws InterruptedException {
        Login_Modal login_modal = new Login_Modal();
        login_modal.getLogin_btn().click();
        Thread.sleep(1000);
    }

    @Then("verify that the user is logged in successfully")
    public void verify_that_the_user_is_logged_in_successfully() {
        Login_Modal login_modal = new Login_Modal();
        String result = login_modal.getNameOfUser_element().getText();
        Assert.assertTrue(result.contains("dk"));
    }

    @And("enter invalid account")
    public void enter_invalid_account() {
        Login_Modal login_modal = new Login_Modal();
        login_modal.getUsername_textField().sendKeys("dk_invalid");
        login_modal.getPassword_textField().sendKeys("q1w2e3_invalid");
    }

    @Then("verify that the user is not able to logged in")
    public void verifyThatTheUserIsNotAbleToLoggedIn() {
        String result = driver.switchTo().alert().getText();
        Assert.assertNotEquals(result, "Welcome");
    }

    @And("enter valid username and invalid password")
    public void enterValidUsernameAndInvalidPassword() {
        Login_Modal login_modal = new Login_Modal();
        login_modal.getUsername_textField().sendKeys("dk");
        login_modal.getPassword_textField().sendKeys("q1w2e3_invalid");
    }

    @And("enter invalid username and valid password")
    public void enterInvalidUsernameAndValidPassword() {
        Login_Modal login_modal = new Login_Modal();
        login_modal.getUsername_textField().sendKeys("dk_invalid");
        login_modal.getPassword_textField().sendKeys("q1w2e3");
    }



}
