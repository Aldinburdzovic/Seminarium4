
package integration;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aldin
 */
public class GarageTest {
    
    

    /**
     * Test of open method, of class Garage.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        Garage instance = new Garage();
        instance.open();
        
    }

    /**
     * Test of close method, of class Garage.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        Garage instance = new Garage();
        instance.close();
       
    }

    /**
     * Test of getDoorStatus method, of class Garage.
     */
    @Test
    public void testGetDoorStatus() {
        System.out.println("getDoorStatus");
        int expResult = 1;
        int result = Garage.getDoorStatus();
        assertEquals(expResult, result);
        
    }
    
}
