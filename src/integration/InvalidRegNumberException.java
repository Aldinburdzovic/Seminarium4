/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * The exception is thrown when the registration number is invalid.
 * @author Aldin
 */
public class InvalidRegNumberException extends Exception {
    
    /**
     * Creates an exception with an error message.
     * @param regNumber the invalid reg number that has been entered
     */
    public InvalidRegNumberException(String regNumber){
        super("Registration number " + regNumber + " is not valid");
    }
}
