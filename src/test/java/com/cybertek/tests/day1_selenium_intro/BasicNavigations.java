package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // setup the browser driver
        WebDriverManager.chromedriver().setup();

        // create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        // this line will maximize the browser size
        // better to include this line before we perform any actions
        driver.manage().window().maximize();

        // will work for mac only
        driver.manage().window().fullscreen();

        // get the page Tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("Current title = " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        // going back using navigations
        driver.navigate().back();

        // going forward using navigations
        driver.navigate().forward();

        // refreshing the page using navigations
        driver.navigate().refresh();

        // going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title = " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        // this method will close the currently opened browser
        // it will only close 1 browser or 1 tab
        driver.close();

        // driver.quit();


    }

}
