/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author AboodHassKov
 */
public class accountsVisitorDisplay implements accountsVisitor{

    @Override
    public String visit(checkingAccount CA) {
        return "Displaying Checking Account";
    }

    @Override
    public String visit(merchantAccount MA) {
        return "Displaying Merchant Account";
    }

    @Override
    public String visit(savingAccount SA) {
        return "Displaying Saving Account";
    }
    
}
