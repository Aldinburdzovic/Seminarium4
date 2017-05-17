
package model;

import integration.Printer;

/**
 * handles the paymetn of the inspection
 * @author Aldin
 */

public class Payment {
    
    private boolean paymentApproval;
    private Printer print;
    private final CreditCard creditCard;
    private final int cost;
    
    /** 
     * Creates the constructor for the payment
     * @param creditCard the information of the credit card paying for the inspections
     * @param cost the total cost of the inspection.
     */
    public Payment(CreditCard creditCard, int cost){
        this.creditCard = creditCard;
        this.cost = cost;
        createReciept(0);
        
    }
    /**
     * creates the reciept of the payment
     * @param cost payed cost
     */
    private void createReciept(int cost){
    Reciept recieptOfPayment = new Reciept(cost);
    
}
}

    