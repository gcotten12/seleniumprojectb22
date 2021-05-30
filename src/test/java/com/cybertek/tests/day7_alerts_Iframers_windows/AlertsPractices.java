package com.cybertek.tests.day7_alerts_Iframers_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void tc1() {

        /**
         * TC #1: Information alert practice
         * 3. Click to “Click for JS Alert” button
         * 4. Click to OK button from the alert
         * 5. Verify “You successfuly clicked an alert” text is displayed.
         */

        WebElement jsAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement alertAcceptedText = driver.findElement(By.xpath("//p[@id='result']"));

//        String actualAlertText = alertAcceptedText.getText();
//        String expectedAlertText = "You successfuly clicked an alert";
//        Assert.assertEquals(actualAlertText, expectedAlertText , "Text did not match");

        Assert.assertTrue(alertAcceptedText.isDisplayed());

    }

    @AfterClass
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
