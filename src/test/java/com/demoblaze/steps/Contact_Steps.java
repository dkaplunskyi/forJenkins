package com.demoblaze.steps;

import com.demoblaze.pages.Home_Page;
import com.demoblaze.pages.model_windows.Contact_Modal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.demoblaze.base.Hooks.driver;

public class Contact_Steps {


    @When("click contact link in the header")
    public void clickContactLinkInTheHeader() {
        Home_Page home_page = new Home_Page();
        home_page.getContact_link().click();
    }

    @Then("fill out form")
    public void fillOutForm() {
        Contact_Modal contact_modal = new Contact_Modal();
        contact_modal.getRecipient_email_textField().sendKeys("qwerty@gmail.com");
        contact_modal.getRecipient_name_textField().sendKeys("Julia");
        contact_modal.getMessage_textField().sendKeys("Hello! I'm Julia from Russia");
    }

    @Then("click Send message button")
    public void clickSendMessageButton() {
        Contact_Modal contact_modal = new Contact_Modal();
        contact_modal.getSendMessage_btn().click();
    }

    @And("check alert message")
    public void checkAlertMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        String result = driver.switchTo().alert().getText();
        System.out.println(result);
        Assert.assertTrue(result.contains("Thanks for the message"));
    }


}
