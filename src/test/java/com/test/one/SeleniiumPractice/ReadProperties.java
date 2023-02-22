package com.test.one.SeleniiumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    public static String getProperties(String key) {
        String value;
        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream("/home/dell/Documents/Projects/SeleniumPractice/files/config.properties")) {
            properties.load(inputStream);
             value = properties.getProperty(key);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  value;
    }
}

