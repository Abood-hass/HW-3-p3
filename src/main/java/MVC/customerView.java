/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author AboodHassKov
 */
public class customerView implements view{
    
    @Override
    public String show(String name, String address,
            String dateOfBirth, String accountNumber) {
        return("Name the Customer: "+name)+
        ("\nAddress the Customer: "+address)+
        ("\nDate of Birth the Customer: "+dateOfBirth)+
        ("\nAccount Number of the Customer: "+accountNumber);
    }
}
