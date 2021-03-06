package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Table_Tasks extends TestBase {



    /**
     * Open browser and go to: http://practice.cybertekschool.com/tables#edit
     * Locate first table and verify Tim has due amount of “$50”
     *
     * Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
     */

    @Test
    public void task3ReturnTimsDueAmount() {
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
        // 1st way
        // WebElement firstTableWhereTimHas$50 = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        // 2nd way
        WebElement firstTableWhereTimHas$50 = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/following-sibling::td[2]"));
        String actualText = firstTableWhereTimHas$50.getText();
        String expectedText = "$50.00";

        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void task4VerifyIfNameIsInTable() {
        TableUtils.verifyOrder(driver, "Tim");

   }
}
