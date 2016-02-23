package main;

import command.Command;
import command.Factory;
import command.RuntimeProcess;

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

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int enteredCommand;
        Command command = null;
        boolean quit=false;
        do{
            print();
            enteredCommand = scanner.nextInt();
            switch (enteredCommand) {
                case 1:
                    command = getCommand("pwd");
                    command.execute();
                    break;
                case 2:
                    command = getCommand("ls");
                    command.execute();
                    break;
                case 3:
                    command = getCommand("ps");
                    command.execute();
                    System.out.println("Write process filter");
                    String processesFilter=scanner.next();
                    RuntimeProcess runtimeProcess=new RuntimeProcess();
                    runtimeProcess.ps(processesFilter);
                    break;
                case 4:
                    quit=true;
                    break;
                default:
                    System.out.println("Choose represented commands");
                    break;
            }
        }while (quit==false);

    }

    private static Command getCommand(String command) {
        return Factory.getInstance().getCommand(command);
    }

    private static void print() {
        System.out.println("1:pwd");
        System.out.println("2:ls");
        System.out.println("3:ps");
        System.out.println("4:quit");
        System.out.println("Enter your choice");
    }
}
