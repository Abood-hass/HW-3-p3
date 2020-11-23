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
public class customer {
    private String name;
    private String address;
    private String dateOfBirth;
    private String accountNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String houseNumber, String street, String city) {
        this.address = houseNumber+" / "+street+" / "+city;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String day, String month, String year) {
        this.dateOfBirth = month+"/"+day+"/"+year;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    
    
}
