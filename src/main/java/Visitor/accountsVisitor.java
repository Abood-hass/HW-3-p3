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
public interface accountsVisitor {
    public String visit(checkingAccount CA);
    public String visit(merchantAccount MA);
    public String visit(savingAccount SA);
}
