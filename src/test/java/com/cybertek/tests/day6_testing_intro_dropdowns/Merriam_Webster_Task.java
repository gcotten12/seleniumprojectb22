package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Merriam_Webster_Task {

    public static void main(String[] args) {

        /**
         * 1. Open Chrome browser
         * 2. Go to https://www.merriam-webster.com/
         * 3. Print out the texts of all links
         * 4. Print out how many link is missing text
         * 5. Print out how many link has text
         * 6. Print out how many total link
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.merriam-webster.com/");

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
//        for (WebElement eachLink : allLinks) {
//            System.out.println(eachLink.getText());
//        }

        int empty = 0;
        int hasText = 0;
        int totalLinks = 0;

        for (int i = 0; i < allLinks.size(); i++) {
            if (allLinks.get(i).getText().isEmpty()) {
                empty++;
                System.out.println(i + ". " + allLinks.get(i).getText());
            }else if(!allLinks.get(i).getText().isEmpty()) {
                hasText++;
                System.out.println(i + ". " + allLinks.get(i).getText());
            }

        }

        totalLinks += empty + hasText;
        System.out.println("\n" + empty + " links with no text\n" + hasText + " links with text");
        System.out.println("There are : " + totalLinks + " links on the page");

    }
}