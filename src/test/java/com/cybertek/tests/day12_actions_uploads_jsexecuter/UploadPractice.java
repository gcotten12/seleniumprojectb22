package com.cybertek.tests.day12_actions_uploads_jsexecuter;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void uploadTest() {
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        WebElement chooseFileButton = Driver.getDriver().findElement(By.id("file-upload"));
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        String path = "/Users/garrettcotten/Desktop/IMG_2957.jpg";
        chooseFileButton.sendKeys(path);
        uploadButton.click();
        WebElement uploadVerificationText = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(uploadVerificationText.isDisplayed());

    }
}
