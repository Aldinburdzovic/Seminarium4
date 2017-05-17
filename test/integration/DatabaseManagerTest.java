
package integration;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aldin
 */
public class DatabaseManagerTest {
    

    /**
     * Test of findInspectionsByVehicle method, of class DatabaseManager.
     */
    @Test
    public void testFindInspectionsByVehicle() throws InvalidRegNumberException {
        System.out.println("findInspectionsByVehicle" );
        String regNumber = "ABC123";
        DatabaseManager instance = new DatabaseManager();
        SpecifiedInspection[] expResult = instance.findInspectionsByVehicle(regNumber);
        SpecifiedInspection[] result = instance.findInspectionsByVehicle(regNumber);
        assertArrayEquals(expResult, result);
        
    }

   
    
}
