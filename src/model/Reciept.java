
package model;

/**
 * this class represents the reciept of the paymetn
 * @author Aldin
 */

public class Reciept {
    
    private final int cost;
    private Inspection inspection;
    
    /**
     * creates an object reciept
     * @param cost total cost payed for
     */
    public Reciept(int cost){
        this.cost = cost;
        
    }
}
