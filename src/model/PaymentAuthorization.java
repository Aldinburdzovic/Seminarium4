
package model;

/**
 * this class represent an imitation of the external payment authoraization system
 * @author Aldin
 */
public class PaymentAuthorization {
    
    /**
     * this method authorizes the payment
     * @param creditCard credit card paying for the inspection
     * @param cost total cost to be payed
     * @return this dummy implementation always returns true/approved
     */
    public static boolean authorization(CreditCard creditCard, int cost){
        boolean approval = false;
        int bankAccountBalance = 200;
        if(cost > bankAccountBalance){
            approval = true;
        }
        System.out.println("Payment has been authorized");
        return approval;
    }
}
