/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 * this class is an object for the creditcard
 * @author Aldin
 */

public class CreditCard {
  
    private final int pin;
    private final String number;
    private final String holder;
    private final Date expiryDate;
    private final int cvc;
    
    /**
     * data object for a creditcard
     * @param pin pin number
     * @param number number of the creditcard
     * @param holder holder of the creditcard
     * @param expiryDate expiry date
     * @param cvc cvc number
     */
    public CreditCard(int pin, String number, String holder, Date expiryDate, int cvc){
    this.pin = pin;
    this.number = number;
    this.holder = holder;
    this.expiryDate = expiryDate;
    this.cvc = cvc;
}
}
