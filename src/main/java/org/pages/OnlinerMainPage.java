package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerMainPage extends BasePage {

    private final By SEARCH_FIELD = By.cssSelector(".fast-search__input");

    private final By SEARCH_FIELD_IFRAME = By.cssSelector(".search__input");

    private final By FIRST_PRODUCT = By.xpath("//a[contains(text(),'Philips HD2581/00')]");

    public OnlinerMainPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL_ONLINER);
    }

    public void sendDataInTheSearchField() {
        driver.findElement(SEARCH_FIELD).sendKeys("Тостер");
    }

    public void cleanAndSendDataInTheSearchField() {
        driver.findElement(SEARCH_FIELD_IFRAME).clear();
        String firstProductName = driver.findElement(FIRST_PRODUCT).getText();
        driver.findElement(SEARCH_FIELD_IFRAME).sendKeys(firstProductName);
    }

    public void goToMainPage() {
        driver.findElement(By.xpath("//span[@class='search__close']")).click();
    }

    public String getTextFromSearchField() {
        return driver.findElement(By.xpath("//span[@class='text_match']")).getText();
    }

    public void scroll100() {
        js.executeScript("window.scrollBy(0,100)");
    }

    public void scrollToElement() {
        WebElement element = driver.findElement(By.linkText("Каталог"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDown() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollUp() {
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
    }
}
