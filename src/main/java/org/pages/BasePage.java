package org.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    JavascriptExecutor js;

    WebDriverWait wait;

    public final static String BASE_URL = "https://demoqa.com/";

    public final static String BASE_URL_ONLINER = "https://www.onliner.by/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
