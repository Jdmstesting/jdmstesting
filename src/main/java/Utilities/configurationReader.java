package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class configurationReader {
    private static Properties properties;

    static {
        try{
            String path = "config/configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String get (String keyName){
        return properties.getProperty(keyName);

    }
}
