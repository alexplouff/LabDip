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
public class TipCalculatorService {
    
    private final TipCalculator calculatorType;

    
    public TipCalculatorService ( TipCalculator calculatorType ){
        this.calculatorType = calculatorType;
    }
    
    public double getTipAmount(){
        return calculatorType.getTipAmount();
    }
    
    @Override
    public String toString(){
        return calculatorType.toString();
    }
    
    
    
}
