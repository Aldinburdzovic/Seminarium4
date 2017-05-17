
package integration;

/**
 *This class handles the garage door.
 * @author Aldin
 */
public class Garage {
        
        public static int doorStatus = 2;
        
        /** 
         * the method open is an imitaion of the garage door opening and the same for close.
         * 
         * doorStatus = 1 -> door open.
         *  doorStatus = 2 -> door closed.
         */
        
        public void open(){
           System.out.println("Garage door opens"); 
           doorStatus = 1;
        }
        public void close(){
            System.out.println("Garage door closes"); 
            doorStatus = 2;
        }
        /**
         * 
         * @return returns the door status. 1 foor open and 2 for closed.
         */
        public static int getDoorStatus(){
            return doorStatus;
        }
}
