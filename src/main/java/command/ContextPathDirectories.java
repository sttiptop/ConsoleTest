package command;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class ContextPathDirectories implements Command{
    private static final Logger log = Logger.getLogger(ContextPathDirectories.class);

    public void execute(){
        File[] files;
        File path = new File(".");

        if (!path.exists()) {
            try {
                throw new IOException(path.getName() + ": No such file or directory");
            } catch (IOException e) {
                log.error("Problem with file or directory",e);
                e.printStackTrace();
            }
        }
        if (path.isFile()) {
            files = new File[]{path};
        } else {
            files = path.listFiles();
        }
        print(files);
    }

    private void print(File[] files) {
        for (File f : files) {
            String formattedName=f.getName();
            if(f.isDirectory()){
                formattedName+=File.separator;
            }
            System.out.println(formattedName);
        }
    }
}

