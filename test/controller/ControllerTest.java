
package controller;

import integration.DatabaseManager;
import integration.DisplayNumber;
import integration.Garage;
import integration.InvalidRegNumberException;
import integration.SpecifiedInspection;
import model.CreditCard;
import model.Inspection;
import model.PaymentAuthorization;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aldin
 */
public class ControllerTest {
    
    Controller instance;
    DatabaseManager dbMgr;
    
    
    @Before
    public void setUp() throws InvalidRegNumberException {
        dbMgr = new DatabaseManager();
        instance = new Controller(dbMgr);
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of newInspection method, of class Controller.
     */
    @Test
    public void testNewInspection() {
        System.out.println("newInspection");
        instance.newInspection();
        int result = DisplayNumber.nextNumber();
        int expResult = 1;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of closeDoor method, of class Controller.
     */
    @Test
    public void testCloseDoor() {
        System.out.println("closeDoor");
        instance.closeDoor();
        int result = Garage.getDoorStatus();
        int expResult = 2;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of enterVehicleNumber method, of class Controller.
     */
    @Test
    public void testEnterVehicleNumber() throws InvalidRegNumberException {
        System.out.println("enterVehicleNumber");
        String regNumber = "ABC123";
        //Controller instance = null;
        int expResult = 0;
        int result = instance.enterVehicleNumber(regNumber);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of cardPayment method, of class Controller.
     */
    @Test
    public void testCardPayment() {
        System.out.println("cardPayment");
        CreditCard creditCard = null;
        instance.cardPayment(creditCard);
        int cost = 0;
        boolean result = PaymentAuthorization.authorization(creditCard, cost);
        boolean expResult = true;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getInspection method, of class Controller.
     */
    @Test
    public void testGetInspection() {
        System.out.println("getInspection ");
        boolean expResult = true;
        boolean result = instance.getInspection().equals(new SpecifiedInspection("brakes", 50));
        assertEquals(expResult, result);
       
    }

    /**
     * Test of enteredResult method, of class Controller.
     */
    @Test
    public void testEnteredResult() {
        System.out.println("enteredResult");
        boolean result_2 = false;
        instance.enteredResult(result_2);
    }
    
}
