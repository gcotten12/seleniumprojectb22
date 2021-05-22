package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/inputs");

        driver.findElement(By.className("nav-link")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Verification Passed");
        }else {
            System.out.println("Title Verification Failed");
        }


    }
}
