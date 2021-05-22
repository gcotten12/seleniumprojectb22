package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        // WebElement actualHeader = driver.findElement(By.tagName("h3"));
        // String actualHeaderText = actualHeader.getText();
        String actualHeader = driver.findElement(By.tagName("h3")).getText();
        String expectedHeader = "Log in to ZeroBank";
        if(actualHeader.equalsIgnoreCase(expectedHeader)) {
            System.out.println("Header Verification Passed");
        }else {
            System.out.println("Header Verification Passed");
        }



    }
}
