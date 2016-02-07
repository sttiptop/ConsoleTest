package main;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class Main {


    public static void main(String[] arg) throws URISyntaxException, IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter string ('quit' to exit):");
            System.out.println("Enter's commands 'pwd','ps','ls'");
            String s = scanner.next();
            if (s.equalsIgnoreCase("quit")) {
                break;
            } else {
                GetProperty getProperty = new GetProperty();
                Properties properties = getProperty.getProp();
                //Enumeration enuKeys = properties.keys();
                if (properties.getProperty(s) != null) {
                    Object obj = Class.forName(properties.getProperty(s)).newInstance();
                    Method method = obj.getClass().getMethod(s);
                    method.invoke(obj);
                }
            }
        }


    }
}
