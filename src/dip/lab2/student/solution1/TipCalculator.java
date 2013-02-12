/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Stuart Caddell
 */
public interface TipCalculator {
    
    /**
     * Sets the number of units the tip is to be based upon.
     * For food service it would be bill amount
     * For baggage, it would be the number of bags
     * Each Tip type should have it's own "based upon"
     */
    void setNumUnitsTipBasedUpon(double numOfUnits);
    
    /**
     * Sets the Service Rating, or the quality of service received.
     */
    void setServiceRating(String serviceQuality);
    
    /**
     * Gets the tip amount 
     */
    double getTip();
    
    
    
}
