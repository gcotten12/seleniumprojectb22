package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {

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
        driver.close();
    }
}
