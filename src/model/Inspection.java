
package model;

import integration.SpecifiedInspection;
import java.util.ArrayList;
import java.util.List;

/**
 * this class represents the inspection of a vehicle
 * @author Aldin
 */
public class Inspection {
    private final SpecifiedInspection[] inspections;
    private final String regNumber;
    private List<ResultObserver> resultObservers = new ArrayList<>();
    private List results;
    
    
    /**
     * creates an instance of the object inspection
     * @param regNumber registration number of the vehicle
     * @param inspections the inspections to be performed for the specific vehicle
     */
    public Inspection(String regNumber, SpecifiedInspection[] inspections){
        this.regNumber = regNumber;
        this.inspections = inspections; 
        
    }
   /**
    * return the total cost for the inspection
    * @return total cost of inspection
    */
    public int getCost(){
        int totalCost = 0;
        for(SpecifiedInspection specInsp : inspections){
        totalCost = totalCost + specInsp.getCost();                   
   }
       
        
        return totalCost;
    }
    /**
     * creates an arraylist with the results of the specified inspections.
     * @param result the result of the specific inspection, pass or fail.
     */
    public void createResults(boolean result){
        results = new ArrayList();
        results.add(result);
        if(result){
        System.out.println("\nRESULT:");
        System.out.print("Inspection passed\n");
        }else{
            System.out.println("\nRESULT:");
            System.out.print("Inspection failed\n");
        }
       notifyObserver(result);
    }
 
    private void notifyObserver(boolean result){
        for(ResultObserver obs: resultObservers){
            obs.newResult(result);
        }
    }
    
    public void addResultObserver(List<ResultObserver> obs){
        resultObservers.addAll(obs);
    }
    
}
