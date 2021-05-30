package com.cybertek.tests.day7_alerts_Iframers_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractices {

    // making WebDriver an instance variable so we can use it everywhere in our class
    WebDriver driver;

    /**
     * TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
     * 1. Open Chrome browser
     * 2. Go to http://practice.cybertekschool.com/dropdown
     * 3. Verify “Simple dropdown” default selected value is correct
     * Expected: “Please select an option”
     * 4. Verify “State selection” default selected value is correct
     * Expected: “Select a State”
     */

    @BeforeClass
    public void setUpClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void tc1_simple_dropdown_test(){
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));

        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        WebElement defaultSelectedOption = stateDropDown.getFirstSelectedOption();
        String actualTextOfStateDropDown = defaultSelectedOption.getText();
        String expectedTextOfStateDropDown = "Select a State";

        Assert.assertEquals(actualTextOfStateDropDown,expectedTextOfStateDropDown);

    }

    @AfterClass
    public void teardownClass() {
        driver.close();
    }

}
