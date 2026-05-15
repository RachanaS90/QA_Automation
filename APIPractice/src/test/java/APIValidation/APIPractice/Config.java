package APIValidation.APIPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    
    public static String getProperty(String key) {
        Properties prop = new Properties();
        try {
            // We point directly to config.properties
            FileInputStream fis = new FileInputStream("src/test/resources/env.properties");
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("Error: Could not find env.properties in src/test/resources");
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}