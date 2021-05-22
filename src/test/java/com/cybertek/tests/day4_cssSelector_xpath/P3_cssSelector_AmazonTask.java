package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        WebElement amazonSearchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBox.sendKeys("wooden spoon" + Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com : wooden spoon";
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed");
        }else {
            System.out.println("Title Verification Failed");
        }

    }
}
