package command;

import constants.Consts;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class RuntimeProcess implements Command{
    private static final String typeOS=OSType.detectOS();
    private static final Logger log = Logger.getLogger(RuntimeProcess.class);

    public void ps(String process) {
        if (typeOS.equalsIgnoreCase("unix")) {
            BufferedReader input = null;
            try {
                String line;
                Process p = Runtime.getRuntime().exec(Consts.UNIX_PROCESSES);
                input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                    if (line.contains(process)) System.out.println(line);
                }
            } catch (Exception err) {
                log.error("all Exceptions in detect BSD with param of sort ",err);
                err.printStackTrace();
            } finally {
                try {
                    input.close();
                } catch (IOException e) {
                    log.error("Exception in close input stream BSD with param of sort",e);
                    e.printStackTrace();
                }
            }
        }
        if (typeOS.equalsIgnoreCase("win")) {
            BufferedReader input = null;
            try {
                String line;
                Process p = Runtime.getRuntime().exec
                        (Consts.WIN_PROCESSES);
                input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                    if (line.contains(process)) System.out.println(line);
                }
            } catch (Exception err) {
                log.error("all Exceptions in detect Windows with param of sort ",err);
                err.printStackTrace();
            } finally {
                try {
                    input.close();
                } catch (IOException e) {
                    log.error("Exception in close input stream Windows with param of sort",e);
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void execute() {
        if (typeOS.equalsIgnoreCase("unix")) {
            BufferedReader input = null;
            try {
                String line;
                Process p = Runtime.getRuntime().exec(Consts.UNIX_PROCESSES);
                input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception err) {
                log.error("all Exceptions in detect BSD ",err);
                err.printStackTrace();
            } finally {
                try {
                    input.close();
                } catch (IOException e) {
                    log.error("Exception in close input stream BSD",e);
                    e.printStackTrace();
                }
            }
        }
        if (typeOS.equalsIgnoreCase("win")) {
            BufferedReader input = null;
            try {
                String line;
                Process p = Runtime.getRuntime().exec
                        (Consts.WIN_PROCESSES);
                input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((line = input.readLine()) != null) {
                   System.out.println(line);
                }
            } catch (Exception err) {
                log.error("all Exceptions in detect Windows ",err);
                err.printStackTrace();
            } finally {
                try {
                    input.close();
                } catch (IOException e) {
                    log.error("Exception in close input stream Windows",e);
                    e.printStackTrace();
                }
            }
        }

    }
}
