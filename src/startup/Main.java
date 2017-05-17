
package startup;

import controller.Controller;
import integration.DatabaseManager;
import integration.InvalidRegNumberException;
import java.io.IOException;
import tools.Logger;
import view.View;

/**
 * starts the application
 * @author Aldin
 */
public class Main {
    /**
     * this is the main method of the applications which starts the entire system.
     * @param args 
     */
    public static void main(String[] args) throws IOException, InvalidRegNumberException {
        DatabaseManager dbMgr = new DatabaseManager();
        Controller contr = new Controller(dbMgr);
        Logger logger = new Logger();
        View view = new View(contr, logger);
        view.execution();
       
        
        
    }
}
