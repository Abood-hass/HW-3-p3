/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;


/**
 *
 * @author AboodHassKov
 */
public class balanceJD implements everyBalance{

    @Override
    public double calculate(Customer C) {
        C.setBalanceStrategy(this);
        return C.getBalance()/4.71;
    }

    @Override
    public String toString() {
        return "Converting from ILS to JD";
    }

    
    
}
