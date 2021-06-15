package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {

    public static void loginToSmartBears(WebDriver driver) {
        WebElement username = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }

    /**
     * PRACTICE #4: Method: verifyOrder
     * • Create a method named verifyOrder in SmartBearUtils class.
     * • Method takes WebDriver object and String(name).
     * • Method should verify if given name exists in orders.
     * • This method should simply accepts a name(String), and assert whether
     * given name is in the list or not.
     * • Create a new TestNG test to test if the method is working as expected.
     */

    public static void verifyOrder(WebDriver driver, String name) {
        List<WebElement> namesInTable = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        for (WebElement eachName : namesInTable) {
            if(eachName.getText().equals(name)) {
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.assertTrue(false, "Name is not present in our table");
    }


}
