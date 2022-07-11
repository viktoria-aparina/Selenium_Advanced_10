package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage {

    private final By FIRST_ALERT_BUTTON = By.id("alertButton");
    private final By SECOND_ALERT_BUTTON = By.id("timerAlertButton");
    private final By THIRD_ALERT_BUTTON = By.id("confirmButton");
    private final By FOURTH_ALERT_BUTTON = By.id("promtButton");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "alerts");
    }

    public void clickOnTheFirstButton() {
        driver.findElement(FIRST_ALERT_BUTTON).click();
    }

    public void clickOnTheSecondButton() {
        driver.findElement(SECOND_ALERT_BUTTON).click();
    }

    public void clickOnTheThirdButton() {
        driver.findElement(THIRD_ALERT_BUTTON).click();
    }

    public void clickOnTheFourthButton() {
        driver.findElement(FOURTH_ALERT_BUTTON).click();
    }

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getTextNearThirdButton() {
        return driver.findElement(By.id("confirmResult")).getText();
    }

    public void enterName() {
        driver.switchTo().alert().sendKeys("Vika");
    }

    public String getTextNearFourthButton() {
        return driver.findElement(By.id("promptResult")).getText();
    }
}
