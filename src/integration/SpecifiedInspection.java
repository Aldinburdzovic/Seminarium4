
package integration;
/**
 * Speciies the insåections
 * @author Aldin
 */
public class SpecifiedInspection {
    private final String name;
    private final int cost;
    /**
     * Creates the instance of the specified inspection to be performed
     * @param name the name of the part to inspect
     * @param cost the cost of the specific part to inspect
     */
   public SpecifiedInspection(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    /**
     * return the cost for the specific inspection
     * @return the cost of the specifc inspection.
     */
    public int getCost(){
        return cost;
    }
}
