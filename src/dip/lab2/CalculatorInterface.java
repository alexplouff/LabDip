/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Alex
 */
public interface CalculatorInterface {

    public abstract ServiceQuality getServiceQuality();
    
    public abstract void setServiceQuality( ServiceQuality quality );

    public abstract double getTipAmount();
    
    public abstract String toString();
    
}
