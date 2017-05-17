
package model;

/**
 * A listener interface for reciving notifications about result of inspections.
 * @author Aldin
 */
public interface ResultObserver {
    /**
     * invoked when a result has been entered
     * @param result 
     */
    void newResult(boolean result);
}
