package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_HeaderVerificationP2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement createAPageLink = driver.findElement(By.linkText("Create a Page"));
        // My original script: WebElement createAPageLink = driver.findElement(By.className("_8esh"));
        String actualHrefValue = createAPageLink.getAttribute("href");
        // System.out.println("actualHrefValue = " + actualHrefValue);
        String expectedHrefText = "registration_form";
        if(actualHrefValue.contains(expectedHrefText)) {
            System.out.println("Href value Verification Passed");
        }else {
            System.out.println("Href value Verification Failed");
        }
        
    }
}
