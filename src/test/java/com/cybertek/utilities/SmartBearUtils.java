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

    /**
     * Practice #5: Method: printNamesAndCities
     * • Create a method named printNamesAndCities in SmartBearUtils class.
     * • Method takes WebDriver object.
     * • This method should simply print all the names in the List of All Orders.
     * • Create a new TestNG test to test if the method is working as expected.
     * • Output should be like:
     * • Name1: name , City1: city
     * • Name2: name , City2: city
     */

    public static void printNamesAndCities(WebDriver driver) {
        List<WebElement> namesInTable = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        List<WebElement> citiesInTable = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));
        for (int i = 0; i < namesInTable.size(); i++) {

            System.out.println("Name" + (i+1) + ": " + namesInTable.get(i).getText() + " , City" + (i+1) + ": " + citiesInTable.get(i).getText());

        }
    }





}
