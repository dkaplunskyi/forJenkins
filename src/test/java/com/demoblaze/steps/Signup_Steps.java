package com.demoblaze.steps;

import com.demoblaze.pages.Home_Page;
import com.demoblaze.pages.model_windows.SignUp_Modal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoblaze.base.Hooks.driver;

public class Signup_Steps {


    @And("click signUp link in header")
    public void clickSignInLinkInHeader() throws InterruptedException {
        Home_Page home_page = new Home_Page();
        home_page.getSignin_link().click();
        Thread.sleep(1000);
    }

    @Then("enter new username")
    public void enterNewUsername() {
        SignUp_Modal signUp_modal = new SignUp_Modal();
        signUp_modal.getUsername_textField().sendKeys("someNewUser");
    }

    @Then("enter password")
    public void enterPassword() {
        SignUp_Modal signUp_modal = new SignUp_Modal();
        signUp_modal.getPassword_textField().sendKeys("q1w2e3");
    }

    @And("click signUp button")
    public void clickSignUpButton() throws InterruptedException {
        SignUp_Modal signUp_modal = new SignUp_Modal();
        signUp_modal.getSignUp_btn().click();
        Thread.sleep(1000);
    }

    @Then("verify that the new account created successfully")
    public void verifyThatTheNewAccountCreatedSuccessfully() {
        String result = driver.switchTo().alert().getText();
        Assert.assertTrue(result.contains("successful"));
    }


    @Then("verify that the account already exist")
    public void verifyThatTheAccountAlreadyExist() {
        String result = driver.switchTo().alert().getText();
        Assert.assertTrue(result.contains("exist"));
    }
}
