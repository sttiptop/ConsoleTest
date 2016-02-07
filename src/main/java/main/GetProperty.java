package main;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class GetProperty {
    public Properties getProp() throws IOException {
        Properties properties = new Properties();
        properties.loadFromXML(this.getClass().getClassLoader().getResourceAsStream("properties.xml"));
        return properties;

    }
}
