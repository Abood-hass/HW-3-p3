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
class Customer {
    private everyBalance balanceStrategy = null;
    private double balance;

    public Customer( double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   

    public everyBalance getBalanceStrategy() {
        return balanceStrategy;
    }

    public void setBalanceStrategy(everyBalance balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
    }
    
    
}
