package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link'"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button#form_submit"));
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        WebElement poweredByCybertekSchoolText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("poweredByCybertekSchoolText.isDisplayed() = " + poweredByCybertekSchoolText.isDisplayed());


    }
}
