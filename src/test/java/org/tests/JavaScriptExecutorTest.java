package org.tests;

import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends BaseTest {

    @Test
    public void javaScriptExecutorTest() {
        onlinerMainPage.open();
        onlinerMainPage.scroll100();
        onlinerMainPage.scrollToElement();
        onlinerMainPage.scrollDown();
        onlinerMainPage.scrollUp();
    }
}
