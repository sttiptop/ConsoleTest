package command;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class RuntimeProcess {
    OSType osType = new OSType();

    public void ps() {
        if (OSType.detectOS().equalsIgnoreCase("mac")) {
            try {
                String line;
                Process p = Runtime.getRuntime().exec("ps -e");
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                    System.out.println(line); //<-- Parse data here.
                }
                input.close();
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
        if (osType.detectOS().equalsIgnoreCase("win")) {
            try {
                String line;
                Process p = Runtime.getRuntime().exec
                        (System.getenv("windir") + "\\system32\\" + "tasklist.exe");
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                    System.out.println(line); //<-- Parse data here.
                }
                input.close();
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
    }
}
