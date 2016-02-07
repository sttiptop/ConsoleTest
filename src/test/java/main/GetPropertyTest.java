package main;

import org.junit.Test;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import static org.junit.Assert.*;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class GetPropertyTest {

    @Test
    public void testGetProp() throws Exception {
        InputStream in = GetPropertyTest.class.getResourceAsStream("properties.xml");

       /* URL dir_url = ClassLoader.getSystemResource("properties.xml");
        File dir = new File(dir_url.toURI());

        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.getPath());*/

        Properties properties = new Properties();
        properties.loadFromXML(in);
        // fileInputStream.close();

        Enumeration enuKeys = properties.keys();
        while (enuKeys.hasMoreElements()) {
            String key = (String) enuKeys.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + ": " + value);
        }

    }
}