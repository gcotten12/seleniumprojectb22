package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String actual = driver.getTitle();
        String expected = "Facebook - Log In or Sign Up";

        if(actual.equals(expected)) {
            System.out.println("Title Verification Passed");
        }else {
            System.out.println("Title Verification Failed");
        }

        driver.findElement(By.id("email")).sendKeys("hello");
        driver.findElement(By.id("pass")).sendKeys("world" + Keys.ENTER);

        String newActual = driver.getTitle();
        String newExpected = "Log into Facebook";

        if(actual.equals(expected)) {
            System.out.println("Title Verification Passed");
        }else {
            System.out.println("Title Verification Failed");
        }

        driver.close();


    }
}
