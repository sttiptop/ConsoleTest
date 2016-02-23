package command;

import constants.Consts;
import org.apache.log4j.Logger;

/**
 * Created by Yevgeni on 07.02.2016.
 */

public class ContextPath implements Command{
    private static final Logger log = Logger.getLogger(ContextPath.class);
    public void execute() {
        String contextPath=System.getProperty(Consts.USER_DIR)+System.getProperty(Consts.FILE_SEPARATOR);
        log.info(contextPath);
        System.out.println(contextPath);
    }
}
