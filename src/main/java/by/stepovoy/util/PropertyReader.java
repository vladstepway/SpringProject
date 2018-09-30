package by.stepovoy.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Properties;


/**
 * Class for getting variables from property file
 */
public final class PropertyReader {

    private Properties prop = new Properties();
    private String propFileName = "project.properties";
    private String propValue;

    private PropertyReader() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        try {
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                System.out.println("Property file isn`t found");

            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static class LazyHolder {
        static final PropertyReader propertyReader = new PropertyReader();
    }

    public static PropertyReader getInstance() {
        return LazyHolder.propertyReader;
    }

    /**
     * Method allows to get data from property file
     *
     * @param propKey is the key of the data in the property file
     * @return the data
     */
    public String getProperty(String propKey) {
        propValue = prop.getProperty(propKey);
        return propValue;
    }

}