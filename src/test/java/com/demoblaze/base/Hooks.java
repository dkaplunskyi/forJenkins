package com.demoblaze.base;

import com.demoblaze.utility.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    String URL = "https://www.demoblaze.com/index.html";

    @Before
    public void setUp() {
        driver = BrowserManager.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
