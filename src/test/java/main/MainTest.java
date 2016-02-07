package main;

import com.sun.xml.internal.ws.api.ResourceLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

import static org.junit.Assert.*;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class MainTest {

    @org.junit.Test
    public void testMain() throws Exception {
        Properties properties = new Properties();
        //properties.loadFromXML(this.getClass().getClassLoader().getResourceAsStream("properties.xml"));
        properties.loadFromXML(MainTest.class.getClass().getResourceAsStream("properties.xml"));
        /*InputStream in = MainTest.class.getResourceAsStream("properties.xml");

        URL dir_url = ClassLoader.getSystemResource("properties.xml");
        File dir = new File(dir_url.toURI());

        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.getPath());

        Properties properties = new Properties();
        properties.loadFromXML(in);
       // fileInputStream.close();

        Enumeration enuKeys = properties.keys();
        while (enuKeys.hasMoreElements()) {
            String key = (String) enuKeys.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + ": " + value);
        }
        //String s=properties.load("properties.xml");
        // System.out.print(s);*/


    }
}