package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

    public static void main(String[] args) {

        // Setting up the browser driver
        // translating to html language
        WebDriverManager.chromedriver().setup();

        // Create instance of chrome driver and open browser
        // this is the line that opening the browser
        WebDriver driver = new ChromeDriver();

        // Go to https://www.google.com
        driver.get("https://www.google.com");


    }

}
