package command;

import org.apache.log4j.Logger;
import resourceBundle.XMLResourceBundleControl;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by Yevgeni on 17.02.2016.
 */
public class Factory {
    private static final Logger log = Logger.getLogger(Factory.class);

    ResourceBundle bundle = null;
    Command command = null;
    private Factory(){
            }
    private static class FactoryHolder {
        public static final Factory HOLDER_INSTANCE = new Factory();
    }

    public static Factory getInstance() {
        return FactoryHolder.HOLDER_INSTANCE;
    }

    public Command getCommand(String commandName) {
        bundle=ResourceBundle.getBundle("properties",
                new XMLResourceBundleControl());
        try {
            if (bundle.getString(commandName).contains("command.ContextPath")) {
                return command = new ContextPath();
            }
            if (bundle.getString(commandName).contains("command.ContextPathDirectories")) {
                return command = new ContextPathDirectories();
            }
            if (bundle.getString(commandName).contains("command.RuntimeProcess")) {
                return command = new RuntimeProcess();
            }
        }catch (MissingResourceException missingResourceExceptiong){
            log.error("Missing resources",missingResourceExceptiong);
        }
        return command;
    }
}
