
package model;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aldin
 */
public class PaymentAuthorizationTest {
    
    

    /**
     * Test of authorization method, of class PaymentAuthorization.
     */
    @Test
    public void testAuthorization() {
        System.out.println("authorization");
        CreditCard creditCard = null;
        int cost = 150;
        boolean expResult = false;
        boolean result = PaymentAuthorization.authorization(creditCard, cost);
        assertEquals(expResult, result);
        
    }
    
}
