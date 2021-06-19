package com.cybertek.tests.day12_actions_uploads_jsexecuter;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractice {

    @Test
    public void tc15_actions_hover() {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));

        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));

        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        Actions action = new Actions(Driver.getDriver());

        action.moveToElement(image1).perform();
        Assert.assertTrue(user1.isDisplayed());

        action.moveToElement(image2).perform();
        Assert.assertTrue(user2.isDisplayed());

        action.moveToElement(image3).perform();
        Assert.assertTrue(user3.isDisplayed());

    }

    @Test
    public void scrolling_test() {
        Driver.getDriver().get("http://practice.cybertekschool.com/");
        Actions action = new Actions(Driver.getDriver());
        WebElement poweredByCybertekButton = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        action.moveToElement(poweredByCybertekButton).perform();
    }

}
