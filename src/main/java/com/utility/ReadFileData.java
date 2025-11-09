package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import junit.framework.Assert;

public class ReadFileData {

    private static Properties prop = new Properties();


    public static void loadPropertiesFile() {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            Assert.fail("❌ Unable to load config.properties file: " + e.getMessage());
        }
    }


    public static String getData(String key) {
        if (prop.isEmpty()) {
            loadPropertiesFile();
        }
        String value = prop.getProperty(key);
        if (value == null) {
            Assert.fail("❌ Key '" + key + "' not found in config.properties file");
        }
        return value.trim();
    }
}
