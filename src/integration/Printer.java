
package integration;

import model.Inspection;
import model.Reciept;
/**
 * this class is an imitaion of the printer
 * @author Aldin
 */
public class Printer {
    private Inspection inspection;
    
    /**
     * prints the reciept
     * @param cost cost of the payment.
     * 
     */
    public static void printReciept(int cost){
        System.out.println("RECIEPT");
        System.out.println("The payment of " + cost + " has been approved");
    }
   
}
