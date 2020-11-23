/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author AboodHassKov
 */
public class blockedState implements State{

    /**
     *
     * @param customer
     * @return
     */
    @Override
    public String doAction(Customer customer) {
        customer.setState(this);
        return "Processing Blocked State ...";
    }

    @Override
    public String toString() {
        return "Blocked State";
    }
    
}
