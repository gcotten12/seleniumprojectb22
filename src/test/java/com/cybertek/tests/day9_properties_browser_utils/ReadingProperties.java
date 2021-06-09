package com.cybertek.tests.day9_properties_browser_utils;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        // Create object of properties class (coming from java library)
        Properties properties = new Properties();

        // Open the file using FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        // Load the properties object with our file
        properties.load(file);

        // reading from configuration.properties
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
    }


}
