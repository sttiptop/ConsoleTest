package command;

import java.net.URISyntaxException;

/**
 * Created by Yevgeni on 07.02.2016.
 */
public class ContextPath {
    public void pwd() throws URISyntaxException {
        String s=null;
        s=System.getProperty("user.dir")+System.getProperty("file.separator");
        System.out.println(s);
        //File file=new File(ContextPath.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());

    }
}
