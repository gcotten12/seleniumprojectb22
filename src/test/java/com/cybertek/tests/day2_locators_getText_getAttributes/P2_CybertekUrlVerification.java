package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        Thread.sleep(5000);

        String url = driver.getCurrentUrl();
        if(url.contains("cybertekschool")) {
            System.out.println("Expected url is verified");
        }else{
            System.out.println("Incorrect url!");
        }

        String expectedTitle = driver.getTitle();
        if(expectedTitle.equalsIgnoreCase("practice")) {
            System.out.println("Title is verified");
        }else{
            System.out.println("Incorrect title is present!");
        }

        driver.close();


    }
}
