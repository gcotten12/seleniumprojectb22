package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_MultipleButtons {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        WebElement resultText = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));

        String actualText = resultText.getText();
        String expectedText = "Clicked on button one!";
        if(actualText.equals(expectedText)) {
            System.out.println("Text Verification Passed");
        }else {
            System.out.println("Text Verification Failed");
        }

    }

}
