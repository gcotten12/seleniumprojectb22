package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.LibraryUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_Login {
    WebDriver driver;

    /**
     * 1. Open browser
     * 2. Go to website: http://library2.cybertekschool.com/login.html
     * 3. Enter username: “”
     * 4. Enter password: “”
     * 5. Click to Login button
     * 6. Print out count of all the links on landing page
     * 7. Print out each link text on this page
     * username password
     * student11@library                   tScBPCUr
     * student12@library                  UC0LC9Hj
     * student13@library                   zcVbvUWH
     * librarian13@library                  9rf6axdD
     */

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://library2.cybertekschool.com/login.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void tc1() {

        LibraryUtils.loginToLibrary(driver);

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        int count = 0;
        for (WebElement eachLink : allLinks) {
            System.out.println(eachLink.getText());
            count++;
        }
        System.out.println("There are " + count + " links on the page");

    }


}