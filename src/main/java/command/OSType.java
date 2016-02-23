package command;

import constants.Consts;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class OSType {
    static String checkOS = null;

    public static String detectOS() {
        if (isWindows()) {
            return checkOS = "win";
        }
        else if (isUnix()) return checkOS = "unix";
        return checkOS;
    }


    private static boolean isWindows() {
        return (Consts.OS.contains("win"));
    }

    private static boolean isUnix() {
        return (Consts.OS.contains("nux")||Consts.OS.contains("nix")||Consts.OS.contains("aix"));
    }
}
