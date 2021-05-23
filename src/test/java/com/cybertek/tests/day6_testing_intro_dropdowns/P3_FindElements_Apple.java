package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P3_FindElements_Apple {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com/");

        /**
         * 1. Open Chrome browser
         * 2. Go to https://www.apple.com
         * 3. Click to all of the headers one by one
         *    a. Mac, iPad, iPhone, Watch, TV, Music, Support
         * 4. Print out the titles of the each page
         * 5. Print out total number of links in each page
         * 6. While in each page:
         *    a. Print out how many link is missing text TOTAL
         *    b. Print out how many link has text TOTAL
         */

        // storing all 9 headers from the page including the apple button and search box
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for (int eachLink = 1; eachLink < headerLinks.size()-1; eachLink++) {

            // System.out.println(headerLinks.get(eachLink).getText());

            headerLinks.get(eachLink).click();
            // we need to refresh the page to prevent staleElementException(selenium has fish memory)

            System.out.println("Current title of each page: " + driver.getTitle());

            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Links per page: " + allLinks.size());

            int linksWithNoText = 0;
            int linksWithText = 0;
            for (WebElement each : allLinks) {
                if(each.getText().isEmpty()) {
                    linksWithNoText++;
                }else {
                    linksWithText++;
                }
            }

            System.out.println("\tlinksWithText = " + linksWithText);
            System.out.println("\tlinksWithNoText = " + linksWithNoText);

            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        }



        Thread.sleep(3000);
        driver.quit();

    }

}
