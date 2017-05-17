package integration;

/**
 * this class handles the queue number for the display
 * @author Aldin
 */
public class DisplayNumber {
    
    public static int nextNumber;
    /**
     * this method gives the next queue number for the display.
     * starts at number 1 and increases by 1 every call.
     * @return the next queue number.
     */
    
    public static int nextNumber(){
        nextNumber = 0;
        nextNumber++;
        return nextNumber;
    }
}
