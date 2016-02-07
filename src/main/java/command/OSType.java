package command;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class OSType {
    private static String OS = System.getProperty("os.name").toLowerCase();
    static String checkOS = null;

    public static String detectOS() {
        if (isWindows()) {
            return checkOS = "win";
        } else if (isUnix()) return checkOS = "mac";
        return checkOS;
    }


    private static boolean isWindows() {
        return (OS.contains("win"));
    }

    private static boolean isUnix() {
        return (OS.contains("nux")||OS.contains("nix")||OS.contains("aix"));
    }
}
