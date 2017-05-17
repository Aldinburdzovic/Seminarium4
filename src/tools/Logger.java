
package tools;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A logger program that logs to a file
 * @author Aldin
 */
public class Logger {
    
    private static final String LOG_NAME = "car-inspection-log.txt";
    private PrintWriter logTextFile;
    
    /**
     * set up to write to file
     * @throws IOException 
     */
    public Logger() throws IOException {
        logTextFile = new PrintWriter(new FileWriter(LOG_NAME), true);
    }
    /**
     * Writes the log
     * @param exception exception
     */
    public void log(Exception exception){
        StringBuilder msgBuilder = new StringBuilder();
        msgBuilder.append("EXCEPTION: ");
        msgBuilder.append(exception.getMessage());
        logTextFile.println(msgBuilder);
        exception.printStackTrace(logTextFile);
    }
}
