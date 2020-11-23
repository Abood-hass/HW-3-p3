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
public class customerController {
    private customer model;
    private customerView view;

    public customerController(customer model) {
        this.model = model;
    }
    
    public void setName(String name) {
        this.model.setName(name);
    }
    
    public String getName (){
        return this.model.getName();
    }
    public String getAddress() {
        return this.model.getAddress();
    }

    public void setAddress(String houseNumber, String street, String city) {
        this.model.setAddress(houseNumber, street, city);
    }

    public String getDateOfBirth() {
        return this.model.getDateOfBirth();
    }

    public void setDateOfBirth(String day, String month, String year) {
        this.model.setDateOfBirth(day, month, year);
    }

    public String getAccountNumber() {
        return this.model.getAccountNumber();
    }

    public void setAccountNumber(String accountNumber) {
        this.model.setAccountNumber(accountNumber);
    }

    public void setView(customerView view) {
        this.view = view;
    }
    
    public String updateView(){
        return this.view.show(this.model.getName(),this.model.getAddress()
                ,this.model.getDateOfBirth(),this.model.getAccountNumber());
    }
}
