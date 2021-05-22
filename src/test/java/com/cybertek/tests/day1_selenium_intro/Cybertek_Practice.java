package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_Practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");

        String url = driver.getCurrentUrl();
        String expectedUrl = "cybertek";

        if(url.contains(expectedUrl)) {
            System.out.println("URL is as expected. Verification PASSED!");
        }else {
            System.out.println("URL is not as expected. Verification FAILED!");
        }

        driver.close();




    }

}
