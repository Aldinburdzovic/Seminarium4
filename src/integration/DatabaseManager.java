
package integration;


/**
 * this class makes all the calls to the database
 * @author Aldin
 */

public class DatabaseManager {
    private SpecifiedInspection[] inspections;
   
    
    /**
     * creates a new instance.
     * Uses hardcoded array of inspections insted of calling database
     */
    public DatabaseManager(){
        createInspections();
    }
    /**
     * A call for an array of the inspections to be made. 
     * This return hardcoded inspections if the registration number of the vehicel is ABC123. 
     * @param regNumber registraion number of the vehicle to inspect
     * @return An array of inspections.
     * @throws integration.InvalidRegNumberException Throws an exception if reg number is invalid.
     */
    public SpecifiedInspection[] findInspectionsByVehicle(String regNumber) throws InvalidRegNumberException{
        if(regNumber != "ABC123"){
            throw new InvalidRegNumberException(regNumber);
        }
        
        return inspections;
    }
   /**
    * creates the hardcoded dummy inspections 
    */
    private void createInspections(){
        inspections = new SpecifiedInspection[3];
        inspections[0] = (new SpecifiedInspection("brakes", 50));
        inspections[1] = (new SpecifiedInspection("lights", 40));
        inspections[2] = (new SpecifiedInspection("stearing", 60));
    }
    
    
    
}
