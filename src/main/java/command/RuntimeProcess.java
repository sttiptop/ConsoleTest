package command;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class RuntimeProcess {

    public void ps(String s) {
        if (OSType.detectOS().equalsIgnoreCase("mac")) {
            try {
                String line;
                Process p = Runtime.getRuntime().exec("ps -e");
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                    if(line.contains(s))System.out.println(line); //<-- Parse data here.
                }
                input.close();
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
        if (OSType.detectOS().equalsIgnoreCase("win")) {
            try {
                String line;
                Process p = Runtime.getRuntime().exec
                        (System.getenv("windir") + "\\system32\\" + "tasklist.exe");
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                    if(line.contains(s))System.out.println(line); //<-- Parse data here.
                }
                input.close();
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
    }
}
