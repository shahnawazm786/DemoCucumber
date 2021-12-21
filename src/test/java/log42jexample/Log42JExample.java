package log42jexample;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log42JExample {
    private  static  final Logger logger=LogManager.getLogger(Log42JExample.class);
    public static  void main(String[] arg){
    System.out.println("---------- Hello User Logger Activated  -------");
    logger.trace("We have just greeted the user");
    logger.log(Level.DEBUG,"Debugged mode");
    logger.debug("We have debugged the user");
    logger.info("User information logged");
    logger.warn("User has been warned");
    logger.error("User has been caught in error");
    logger.fatal("User has occured fatal error");
    logger.info("Committed to the github");
    }
}
