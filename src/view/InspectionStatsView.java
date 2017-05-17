
package view;

import model.ResultObserver;

/**
 * Shows the number of passed and failed inspections.
 * @author Aldin
 */
public class InspectionStatsView implements ResultObserver{
    
    private int passed = 0;
    private int failed = 0;

    @Override
    public void newResult(boolean result) {
        addNewResult(result);
        printCurrentState();
        
    }

    private void addNewResult(boolean result) {
        if(result){
            passed++;
        }
        else{
            failed++;
        }
        
    }

    private void printCurrentState() {
        System.out.println("### Result of Inspections ###");
        System.out.println("Amount of passed inspections: " + passed);
        System.out.println("Amount of failed inspections: " + failed);
       
    }
    
    
    
    
}
