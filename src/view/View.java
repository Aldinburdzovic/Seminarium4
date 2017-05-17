package view;

import controller.Controller;
import integration.InvalidRegNumberException;
import model.CreditCard;
import tools.Logger;

/**
 * this class is a placeholder for the view.
 *
 * @author Aldin
 */
public class View {

    private final Controller contr;
    private String regNumber;
    private CreditCard creditCard;
    private Logger logger;

    /**
     * creates an instance that will use the controller for all system
     * operations.
     *
     * @param contr the controller which is used to run the system.
     * @param logger The logger to logg the exceptions
     */
    public View(Controller contr, Logger logger) {
        this.contr = contr;
        this.logger = logger;
        contr.addResultObserver(new InspectionStatsView());
    }

    /**
     * Executes the entire program
     */
    public void execution() {
        contr.newInspection();

        contr.closeDoor();

        int cost = 0;
        String vehicleRegNumber = "CBA321";
        System.out.println("The entered registration number: " + vehicleRegNumber);
        try {
            cost = contr.enterVehicleNumber(vehicleRegNumber);
        } 
        catch (InvalidRegNumberException e) {
            excep(("\nError: Invalid reg number. Try again.\n"), e);
        }
        vehicleRegNumber = "ABC123";
        System.out.println("The entered registration number: " + vehicleRegNumber);
        try {
            cost = contr.enterVehicleNumber(vehicleRegNumber);
        } 
        catch (InvalidRegNumberException e) {
            excep(("invalid reg number"), e);
        }
        
        System.out.println("Cost of inspection: " + cost);

        CreditCard creditCardInfo = creditCard;
        contr.cardPayment(creditCardInfo);

        contr.getInspection();

        boolean result = true;
        contr.enteredResult(result);
        
        result = false;
        contr.enteredResult(result);
        
        result = true;
        contr.enteredResult(result);

    }
    
    /**
     * prints error mesage for the user and logs the exception that has been thrown.
     * @param userErrorMessage the error message of the exception
     * @param e the excpetion
     */
    private void excep(String userErrorMessage, Exception e) {
        System.out.println(userErrorMessage);
        logger.log(e);
    }

}
