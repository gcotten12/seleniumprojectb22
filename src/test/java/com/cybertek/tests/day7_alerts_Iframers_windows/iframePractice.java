package com.cybertek.tests.day7_alerts_Iframers_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void iframe_tc1() {

        /**
         * TC #4 : Iframe practice
         * 1. Create a new class called: IframePractice
         * 2. Create new test and make set ups
         * 3. Go to: http://practice.cybertekschool.com/iframe
         * 4. Assert: “Your content goes here.” Text is displayed.
         * 5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
         */

        // 1) - changing to iframe by index
        // driver.switchTo().frame(0);
        // 2) - switching to iframe by web element
        // WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        // driver.switchTo().frame(iframe);
        // 3) - if iframe has name or id, we can pass its attribute value as a string in the constructor
        driver.switchTo().frame("mce_0_ifr");
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());

    }

    @AfterClass
    public void teardown() {
        driver.close();
    }
}
