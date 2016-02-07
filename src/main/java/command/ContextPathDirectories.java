package command;

import java.io.File;
import java.io.IOException;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class ContextPathDirectories {
    File[] files;

    public void ls() throws IOException {

        File path = new File(".");

        if (!path.exists()) {
            throw new IOException(path.getName() + ": No such file or directory");
        }
        if (path.isFile()) {
            files = new File[]{path};
        } else {
            files = path.listFiles();
        }
        print();
    }

    public void print() {
        for (File f : files) {
            System.out.println(f.getName() + ((f.isDirectory()) ? File.separator : "")
            );
        }
    }
}

