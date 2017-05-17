
package integration;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aldin
 */
public class DisplayNumberTest {
    

    /**
     * Test of nextNumber method, of class DisplayNumber.
     */
    @Test
    public void testNextNumber() {
        System.out.println("nextNumber");
        int expResult = 2;
        int result = DisplayNumber.nextNumber();
        assertEquals(expResult, result);
        
    }
    
}
