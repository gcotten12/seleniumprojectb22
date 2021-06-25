package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void t2_double_click_test() {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //switching to iframe by id
        Driver.getDriver().switchTo().frame("iframeResult");
        WebElement doubleClickText = Driver.getDriver().findElement(By.id("demo"));
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(doubleClickText).perform();
        String expectedInStyle = "red";
        String actualInStyle = doubleClickText.getAttribute("style");
        Assert.assertTrue(actualInStyle.contains(expectedInStyle));
    }

}
