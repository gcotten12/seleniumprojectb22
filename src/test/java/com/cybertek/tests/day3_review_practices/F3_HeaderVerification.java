package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String actualHead = driver.findElement(By.tagName("h2")).getText();
        String expectedHead = "Connect with friends and the world around you on Facebook";
        if(actualHead.contains(expectedHead)) {
            System.out.println("Header Verification Passed");
        }else {
            System.out.println("Header Verification Failed");
        }

    }
}
