
package model;

import integration.DatabaseManager;
import integration.SpecifiedInspection;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aldin
 */
public class InspectionTest {
    
    Inspection instance;
    String regNumber;
    DatabaseManager dbMgr;
    SpecifiedInspection[] inspections;
    
    
    @Before
    public void setUp() {
        instance = new Inspection(regNumber, inspections);
    }
   

    /**
     * Test of getCost method, of class Inspection.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        int expResult = 0;
        int result = instance.getCost();
        assertEquals(expResult, result);
        
    }
    
}
