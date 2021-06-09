package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class LibraryUtils {


    public static void loginToLibrary(WebDriver driver) {
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUsername.sendKeys("student11@library");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");

        BrowserUtils.sleep(5);

        WebElement loginButton = driver.findElement(By.xpath("//button[.='Sign in']"));
        loginButton.click();

    }
}
