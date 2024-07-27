/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerdesginpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sarah
 */
public class Blog implements Subject {
    
    String post;
    List<Observer>observers = new ArrayList<Observer>();
    
    @Override
    public void register(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            observers.get(i).reciveMassege(this.post);
        }
    }
    
    public void setPost(String post){
        this.post = post;
        notifyObservers();
    }
    
}
