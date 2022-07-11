package org.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTest {

    @Test
    public void theFirstAlertTest() {
        alertsPage.open();
        alertsPage.clickOnTheFirstButton();
        assertEquals(alertsPage.getTextFromAlert(), "You clicked a button", "The text ia different");
        alertsPage.acceptAlert();
    }

    @Test
    public void theSecondAlertTest() {
        alertsPage.open();
        alertsPage.clickOnTheSecondButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        assertEquals(alertsPage.getTextFromAlert(), "This alert appeared after 5 seconds", "The text ia different");
        alertsPage.acceptAlert();
    }

    @Test
    public void theThirdAlertTest() {
        alertsPage.open();
        alertsPage.clickOnTheThirdButton();
        assertEquals(alertsPage.getTextFromAlert(), "Do you confirm action?", "The text ia different");
        alertsPage.dismissAlert();
        assertEquals(alertsPage.getTextNearThirdButton(), "You selected Cancel", "The text ia different");
    }

    @Test
    public void theFourthAlertTest() {
        alertsPage.open();
        alertsPage.clickOnTheFourthButton();
        assertEquals(alertsPage.getTextFromAlert(), "Please enter your name", "The text ia different");
        alertsPage.enterName();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getTextNearFourthButton(), "You entered Vika", "The text ia different");
    }
}
