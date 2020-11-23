/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AboodHassKov
 */
public class subject {
    private List<observer> observers =
            new ArrayList<observer>();
    private String date;

    public List<observer> getObservers() {
        return observers;
    }

    public void setObservers(List<observer> observers) {
        this.observers = observers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        notifyAllObservers();
    }
    
    public void attach(observer observer){
       this.observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for (observer observer : this.observers) {
            observer.update();
        }
    }
}
