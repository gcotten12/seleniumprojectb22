package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";
        if(actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification Passed");
        }else {
            System.out.println("Title verification Failed");
        }

        driver.navigate().back();
        String actTitle = driver.getTitle();
        String expTitle = "Google";
        if(actTitle.contains(expTitle)) {
            System.out.println("Title verification Passed");
        }else {
            System.out.println("Title verification Failed");
        }




    }
}
