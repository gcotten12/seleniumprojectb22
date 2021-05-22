package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        String actualLinkText = zeroBankLink.getText();
        String expectedLinkText = "Zero Bank";
        if(actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link text verification Passed");
        }else {
            System.out.println("Link text verification Failed");
        }

        String actualHrefAttribute = zeroBankLink.getAttribute("href");
        String expectedHrefAttribute = "index.html";
        if(actualHrefAttribute.contains(expectedHrefAttribute)) {
            System.out.println("HREF attribute value verification Passed");
        }else {
            System.out.println("HREF attribute value verification Failed");
        }


    }
}
