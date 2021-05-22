package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // we are storing all of the links found by our findElements locator in a List
        List<WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a")); // this locator will locate all links within any web page

        int count = 0;
        // iter + tab -> shortcut for forEach loop
        // itar + tab -> shortcut for for loop
        for(WebElement eachLink : listOfLinks) {
            System.out.println(eachLink.getText());
            System.out.println(eachLink.getAttribute("href"));
            count++;
        }

        System.out.println("Number of links = " + count);

    }

}
