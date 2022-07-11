package org.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class IFramesTest extends BaseTest {

    @Test
    public void iFramesTest() {
        onlinerMainPage.open();
        onlinerMainPage.sendDataInTheSearchField();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".modal-iframe")));
        onlinerMainPage.cleanAndSendDataInTheSearchField();
        onlinerMainPage.goToMainPage();
        assertEquals(onlinerMainPage.getTextFromSearchField(), "Тостер Philips HD2581/00",
                "Products are different");
    }
}
