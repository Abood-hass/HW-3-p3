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
public class merchantAccount implements accounts{

    @Override
    public String accept(accountsVisitor accountsVisitor) {
        return accountsVisitor.visit(this);
    }
    
}