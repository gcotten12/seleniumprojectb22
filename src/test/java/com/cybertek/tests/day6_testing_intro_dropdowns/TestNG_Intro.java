package com.cybertek.tests.day6_testing_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass() {
        System.out.println();
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After class is running...");
    }

    @BeforeMethod
    public void setupMethod() {
        System.out.println("Before method is running...");
    }

    @Test
    public void test1() {
        System.out.println("Running test 1...");

        String actual = "apple";
        String expected = "apples";

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void test2() {
        System.out.println("Running test 2...");
        String actual = "apple";
        String expected = "apples";

        Assert.assertTrue(actual.equals(expected));

    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method is running...");
    }

}


