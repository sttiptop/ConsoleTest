package constants;

import command.OSType;

/**
 * Created by Yevgeni on 20.02.2016.
 */
public class Consts {
    public static final String OS =System.getProperty("os.name").toLowerCase();
    public static final String USER_DIR="user.dir";
    public static final String FILE_SEPARATOR="file.separator";
    public static final String UNIX_PROCESSES="ps -e";
    public static final String WIN_PROCESSES=System.getenv("windir") + "\\system32\\" + "tasklist.exe";
}
